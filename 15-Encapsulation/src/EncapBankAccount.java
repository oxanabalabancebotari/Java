
public class EncapBankAccount {

	public static void main(String[] args) {
		BankAccount client1= new BankAccount(123456, 500.0, "Mike", "mike@gmail.com",44356432);
		client1.depositFunds(1000);
		client1.withdrawFunds(500);
		System.out.println(client1.getBalance());
		System.out.println("The client account number is "+client1.getAcountNumber()+" the client balance is "+
		client1.getBalance()+" the client name "+client1.getCustomerName()+" client email "+client1.getEmail()
		+" client phone number "+client1.getPhoneNumber());
      
	}

}
