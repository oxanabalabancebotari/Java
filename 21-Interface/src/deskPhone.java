
public class deskPhone implements iTelephone{
	
     private int myNumber;
     private boolean isRinging;
       

	public deskPhone(int myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}
	
	public int getMyNumber() {
		return myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, no power button");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("No ringhing "+phoneNumber+" on deskphone");
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answer the desk phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber) {
			isRinging=true;
			System.out.println("Ring ring");
		}else {
			isRinging=false;
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		
		return false;
	}
	

}
