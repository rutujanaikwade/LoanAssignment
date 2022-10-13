package finzly.spring.loanassignment.entity;

public class Login {
	
	private int customerid;
	private String password;
	
	public Login() {
		
	}

	public Login(int customerid, String password) {
		super();
		this.customerid = customerid;
		this.password = password;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
