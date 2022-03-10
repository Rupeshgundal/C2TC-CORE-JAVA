package Bankframework;

public class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public void withdraw(float accBal)
	{
		System.out.println("The withdraw account Balance is"+ accBal);
	}
	
	public void deposite(Float accBal)
	{
		System.out.println("The Deposite account Balance Is"+ accBal);
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	public void Deposite(float amount) {
		// TODO Auto-generated method stub
		


}
