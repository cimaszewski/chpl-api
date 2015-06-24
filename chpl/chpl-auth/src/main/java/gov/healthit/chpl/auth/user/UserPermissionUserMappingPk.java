package gov.healthit.chpl.auth.user;

import gov.healthit.chpl.auth.permission.UserPermission;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class UserPermissionUserMappingPk implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", updatable = false, insertable = false)
	private UserImpl user;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "permission_id_user_permission", updatable = false, insertable = false)
	private UserPermission permission;
	
	
	public int hashCode() {
		return (int)(user.getId() + permission.getId());
	}
	
	public boolean equals(Object object) {
		if (object instanceof UserPermissionUserMappingPk) {
			UserPermissionUserMappingPk otherPk = (UserPermissionUserMappingPk) object;
			return (otherPk.getUser() == this.getUser()) && (otherPk.getPermission() == this.getPermission());
		}
		return false;
	}
	
	public UserPermission getPermission() {
		return permission;
	}
	
	public void setPermission(UserPermission permission) {
		this.permission = permission;
	}
	
	public UserImpl getUser() {
		return user;
	}
	
	public void setUser(UserImpl user) {
		this.user = user;
	}
	
}
