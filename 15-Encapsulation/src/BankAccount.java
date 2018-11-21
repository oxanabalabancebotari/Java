
public class BankAccount {
	private int acountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	
	public int getAcountNumber() {
		return acountNumber;
	}
	public BankAccount(int acountNumber, double balance, String customerName, String email, int phoneNumber) {
		super();
		this.acountNumber = acountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double depositFunds(double deposit) {
		balance+=deposit;
		return balance;
	}
	public double withdrawFunds(double withdrow) {
		if(balance<withdrow) {
			balance-=withdrow;
		}else {
			System.out.println("Insufitient founds"+ balance);
		}
		return balance;
	}

}
