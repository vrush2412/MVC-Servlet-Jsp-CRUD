package Reg.model;

public class Register {
	
	int regno;
	String name;
	String email;
	String uname;
	String pass;
	String accbal;
	
	public Register(int regno, String name, String email, String uname, String pass, String accbal) {
		super();
		this.regno = regno;
		this.name = name;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
		this.accbal = accbal;
	}
	public Register() {
		super();
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAccbal() {
		return accbal;
	}
	public void setAccbal(String accbal) {
		this.accbal = accbal;
	}
	
}