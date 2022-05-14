package com.tnsif.Client;

import com.tnsif.Application.MMBankFactory;
import com.tnsif.Application.MMCurrentAcc;
import com.tnsif.Application.MMSavingAcc;

public class Client {
	public static void main(String[] args) {
		MMBankFactory mmbankfactory = new MMBankFactory();
		mmbankfactory.getNewSavingAccount(1234567, "Abhishek", 1000, true);
		mmbankfactory.getNewCurrentAccount(9876543, "Kang", 3456, 50);

		MMSavingAcc mmsaving = new MMSavingAcc(111, "Abhishek", 1000, true);
		mmsaving.getaccNo();
		mmsaving.getaccNm();
		mmsaving.getaccBal();
		mmsaving.isSalary();
		mmsaving.toString();
		mmsaving.withdraw(5000);
		MMCurrentAcc mmcurrent = new MMCurrentAcc(123, "Kang", 3456, 50);
		mmcurrent.getaccNo();
		mmcurrent.getaccNm();
		mmcurrent.getaccBal();
		mmcurrent.creaditLimit();
		mmcurrent.toString();
		mmcurrent.withdraw(2000);

	}

}