package Bankframework;

public class CurrentAcc extends BankAcc {
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	private float CreditLimit=50000;

	
	
	public float getCreditLimit() {
		return CreditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.CreditLimit = creditLimit;
	}
	
	

}
