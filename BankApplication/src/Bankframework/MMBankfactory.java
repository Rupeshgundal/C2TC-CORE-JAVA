package Bankframework;

public abstract class MMBankfactory implements Bankfactory{
	public SavingAcc getNewSavingAccount(int accNo, String accNum, float accBal) {
		SavingAcc sa = new SavingAcc(accNo,accNum,accBal);
		return sa;

}
}
