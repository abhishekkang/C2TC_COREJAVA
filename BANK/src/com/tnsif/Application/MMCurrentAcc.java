package com.tnsif.Application;

import com.tnsif.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creaditLimit) {
		super(accNo, accNm, accBal, accBal);

	}

	public void withdraw(float accBal) {
		System.out.println("Current Acc " + accBal);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creaditLimit=" + creaditLimit + ", accNo=" + getAccNo() + ", accNm=" + accNm + ", accBal="
				+ accBal + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public int getaccNo() {
		return accNo;

	}

	public String getaccNm() {
		// TODO Auto-generated method stub
		return accNm;
	}

	public float getaccBal() {
		// TODO Auto-generated method stub
		return accBal;
	}

	public void creaditLimit(int i) {
		// TODO Auto-generated method stub
	}

	public void creaditLimit() {
		// TODO Auto-generated method stub

	}
}