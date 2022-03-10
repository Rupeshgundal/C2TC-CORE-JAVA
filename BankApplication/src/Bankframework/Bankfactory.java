package Bankframework;

public interface Bankfactory {
	 SavingAcc getNewSavingAccount(int accNo, String accNum, float accBal);
	 CurrentAcc getNewCurrentAccount(int accNo, String accNum, float accBal);

}
