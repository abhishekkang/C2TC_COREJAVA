package com.tnsif.Application;

import com.tnsif.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);

	}

	static final private float MINBAL = 0;

	public void withdraw(float accBal) {
		System.out.println("Saving Acc" + accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static float getMinbal() {
		return MINBAL;
	}

	public float getaccBal() {
		// TODO Auto-generated method stub
		return accBal;
	}

	public boolean isSalary() {
		// TODO Auto-generated method stub
		return isSalary;

	}

	public int getaccNo() {
		// TODO Auto-generated method stub
		return accNo;

	}

	public String getaccNm() {
		// TODO Auto-generated method stub
		return accNm;
	}
}