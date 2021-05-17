package com.bankbeans;

import java.util.*;

public class Customer {
	int custId;
	String custName;
	String phoneNumber;
	Set<Loans> loans;
	Set<Account> accounts;
	List<Transactions> transaction;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<Loans> getLoans() {
		return loans;
	}
	public void setLoans(Set<Loans> loans) {
		this.loans = loans;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Transactions> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transactions> transaction) {
		this.transaction = transaction;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String phoneNumber, Set<Loans> loans, Set<Account> accounts,
			List<Transactions> transaction) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.loans = loans;
		this.accounts = accounts;
		this.transaction = transaction;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phoneNumber=" + phoneNumber + ", loans="
				+ loans + ", accounts=" + accounts + ", transaction=" + transaction + "]";
	}

}
