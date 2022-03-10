package Bankframework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}



	private boolean isSalary=true;
	
	

	public boolean isSalary() {
		return isSalary;
	}



	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}



	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
		
		
	

}
