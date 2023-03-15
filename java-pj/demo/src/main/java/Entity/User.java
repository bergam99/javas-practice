package Entity;

public class User {

	private String name;
	private String pass;
	
	public User(String n, String p) {
		this.setName(n);
		this.setPass(p);
	}

	public void setName(String n) {
		this.name = n;
	}
	public void setPass(String p) {
		this.pass = p;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPass() {
		return this.pass;
	}
	
	
	
	
	
}
