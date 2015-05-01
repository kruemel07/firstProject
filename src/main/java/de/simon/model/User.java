package de.simon.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class User {
	@Id
	@GeneratedValue
	private long userID;
	@Column
	private String name;
	@Column
	private String userName;
	@Column
	private String password;
	@Column(name = "enabled", nullable = false)
	private boolean enabled;
	@Column
	private String birthday;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")	
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String userName2, String password2, boolean enabled2,
			boolean b, boolean c, boolean d, List<GrantedAuthority> authorities) {
		// TODO Auto-generated constructor stub
	}


	public long getUserID() {
		return userID;
	}


	public void setUserID(long userID) {
		this.userID = userID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public Set<UserRole> getUserRole() {
		return userRole;
	}


	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	

}
