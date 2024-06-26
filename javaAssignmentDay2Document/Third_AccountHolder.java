package com.hcltech.javaAssignmentDay2Document;

public class Third_AccountHolder {
	private  String Acount_No;
	private String AccountHolder_Name;
	private String Phno;
	
	public Third_AccountHolder() {
		super();
	}
	
	public Third_AccountHolder(String acount_No, String accountHolder_Name, String phno) {
		super();
		Acount_No = acount_No;
		AccountHolder_Name = accountHolder_Name;
		Phno = phno;
	}

	public String getAcount_No() {
		return Acount_No;
	}

	public void setAcount_No(String acount_No) {
		Acount_No = acount_No;
	}

	public String getAccountHolder_Name() {
		return AccountHolder_Name;
	}

	public void setAccountHolder_Name(String accountHolder_Name) {
		AccountHolder_Name = accountHolder_Name;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}

	@Override
	public String toString() {
		return "Third_AccountHolder [Acount_No=" + Acount_No + ", AccountHolder_Name=" + AccountHolder_Name + ", Phno="
				+ Phno + "]";
	}
	
	
	
	

}
