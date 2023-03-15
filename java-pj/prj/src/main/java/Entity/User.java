package Entity;

public class User {
	
	private String name;
	private String pass;
	
	public User(String n, String p) {
		setName(n);
		setPass(p);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
