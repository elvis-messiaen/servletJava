package exoServlet;

import java.util.List;

public class User {
	private String UID;
	private String username;
	private String email;
	private Roles roles;
	private List<Articles> articles;
	
	
	public User() {
		
	}


	public User(String uID, String username, String email, Roles roles, List<Articles> articles) {
		super();
		UID = uID;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.articles = articles;
	}
	public User(String uID, String username, String email) {
		super();
		UID = uID;
		this.username = username;
		this.email = email;

	}

	public String getUID() {
		return UID;
	}


	public void setUID(String uID) {
		UID = uID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}


	public List<Articles> getArticles() {
		return articles;
	}




	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}




	@Override
	public String toString() {
		return "User [UID=" + UID + ", username=" + username + ", email=" + email + ", roles=" + roles + ", articles="
				+ articles + "]";
	}
	
}
