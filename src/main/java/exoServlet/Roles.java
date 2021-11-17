package exoServlet;


public class Roles {
	private String name;
	
	
	public Roles() {
	}


	public Roles(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Roles name=" + name ;
	}
	
	

}

