package gov.healthit.chpl.auth.authentication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.transaction.annotation.Transactional;

import gov.healthit.chpl.auth.jwt.JWTAuthor;
import gov.healthit.chpl.auth.jwt.JWTCreationException;
import gov.healthit.chpl.auth.permission.UserPermissionDTO;
import gov.healthit.chpl.auth.user.UserDTO;
import gov.healthit.chpl.auth.user.UserManager;
import gov.healthit.chpl.auth.user.UserRetrievalException;

public abstract class BaseUserAuthenticator implements Authenticator {

	@Autowired
	private JWTAuthor jwtAuthor;
	
	@Autowired
	protected UserManager userManager;
	

	abstract public UserDTO getUser(LoginCredentials credentials)  throws BadCredentialsException, AccountStatusException, UserRetrievalException;
	
	public String getJWT(UserDTO user) throws JWTCreationException {
		
		String jwt = null;
		Map<String, List<String>> claims = new HashMap<String, List<String>>();
		List<String> claimStrings = new ArrayList<String>();
		
		Set<UserPermissionDTO> permissions = userManager.getGrantedPermissionsForUser(user);
		
		for (UserPermissionDTO claim : permissions){
			claimStrings.add(claim.getAuthority());
		}
		claims.put("Authorities", claimStrings);
		
		List<String> identity = new ArrayList<String>();
		
		identity.add(user.getId().toString());
		identity.add(user.getName());
		identity.add(user.getFirstName());
		identity.add(user.getLastName());
		
		claims.put("Identity", identity);
		
		jwt = jwtAuthor.createJWT(user.getSubjectName(), claims);
		return jwt;
		
	}
	
	@Transactional
	public String getJWT(LoginCredentials credentials) throws JWTCreationException {
		
		String jwt = null;
		UserDTO user = null;
		
		try {
			user = getUser(credentials);
		} catch (BadCredentialsException e) {
			throw new JWTCreationException(e);
		} catch (AccountStatusException e1) {
			throw new JWTCreationException(e1);
		} catch (UserRetrievalException e2) {
			throw new JWTCreationException(e2);
		}
		
		if (user != null){
			jwt = getJWT(user);
		}
		
		return jwt;
		
	}
	
	public JWTAuthor getJwtAuthor() {
		return jwtAuthor;
	}
	
	public void setJwtAuthor(JWTAuthor jwtAuthor) {
		this.jwtAuthor = jwtAuthor;
	}

}
