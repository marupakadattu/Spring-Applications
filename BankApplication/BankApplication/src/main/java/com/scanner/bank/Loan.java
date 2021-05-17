package com.scanner.bank;

import java.util.*;

public class Loan {
	int loanId;
	Set loanType;
	double loanAmount;
	double Interest;
	public Loan() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	public Loan(int loanId, Set loanType, double loanAmount, double interest) {
	    super();
	    this.loanId = loanId;
	    this.loanType = loanType;
	    this.loanAmount = loanAmount;
	    Interest = interest;
	}
	public int getLoanId() {
	    return loanId;
	}
	public void setLoanId(int loanId) {
	    this.loanId = loanId;
	}
	public Set getLoanType() {
	    return loanType;
	}
	public void setLoanType(Set loanType) {
	    this.loanType = loanType;
	}
	public double getLoanAmount() {
	    return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
	    this.loanAmount = loanAmount;
	}
	public double getInterest() {
	    return Interest;
	}
	public void setInterest(double interest) {
	    Interest = interest;
	}
	@Override
	public String toString() {
	    return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", Interest=" + Interest
	            + "]";
	}
}
