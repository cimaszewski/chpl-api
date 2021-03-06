package gov.healthit.chpl.auth.authentication;

import gov.healthit.chpl.auth.user.UserImpl;
import gov.healthit.chpl.auth.user.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.authentication.BadCredentialsException;


public class TestUserAuthenticator extends BaseUserAuthenticator {

	
	private static String userID = "testuser";
	private static String password = "pass";
	private List<Claim> claims =  Arrays.asList(new Claim("GROUP_ACB123"),new Claim("ROLE_ADMIN"),new Claim("ROLE_farmer"));
	private Set<Claim> claimset = new HashSet<Claim>(claims);
	User user = new UserImpl(userID, claimset);
	
	@Override
	public User getUser(LoginCredentials credentials) throws BadCredentialsException {
		
		if  ((credentials.getUserName().equals(userID)) && (credentials.getPassword().equals(password))){
			return user;
		} else {
			throw new BadCredentialsException("Bad user name and password combination.");
		}
	}
	
}
