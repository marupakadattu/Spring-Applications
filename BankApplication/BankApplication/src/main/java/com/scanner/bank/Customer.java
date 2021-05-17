package com.scanner.bank;

import java.util.*;

public class Customer {
	String cAccounntNumber;
    String cName;
    Set<String> cAccountType;
    String cPhone;
    Set loans;
    Account acc;
    Withdraw withDraw;
    Loan loan;
    
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Customer(String cAccounntNumber, String cName, Set cAccountType, String cPhone, Set loans, Account acc,
            Withdraw withDraw, Loan loan) {
        //super();
        this.cAccounntNumber = cAccounntNumber;
        this.cName = cName;
        this.cAccountType = cAccountType;
        this.cPhone = cPhone;
        this.loans = loans;
        this.acc = acc;
        this.withDraw = withDraw;
        this.loan = loan;
    }
    
    public String getcAccounntNumber() {
        return cAccounntNumber;
    }
    public void setcAccounntNumber(String cAccounntNumber) {
        this.cAccounntNumber = cAccounntNumber;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    
    public Set<String> getcAccountType() {
        return cAccountType;
    }
    public void setcAccountType(Set<String> cAccountType) {
        this.cAccountType = cAccountType;
    }
    public String getcPhone() {
        return cPhone;
    }
    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }
    public Set getLoans() {
        return loans;
    }
    public void setLoans(Set loans) {
        this.loans = loans;
    }
    public Account getAcc() {
        return acc;
    }
    public void setAcc(Account acc) {
        this.acc = acc;
    }
    public Withdraw getWithDraw() {
        return withDraw;
    }
    public void setWithDraw(Withdraw withDraw) {
        this.withDraw = withDraw;
    }
    public Loan getLoan() {
        return loan;
    }
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
//    Iterator<String> i=cAccountType.iterator();
//    while(i.hasNext()) {
//        
//    }
    
    @Override
    public String toString() {
        return "Customer [cAccounntNumber=" + cAccounntNumber + ", cName=" + cName + ", cAccountType=" + cAccountType
                + ", cPhone=" + cPhone + ", loans=" + loans + ", acc=" + acc + ", withDraw=" + withDraw + ", loan="
                + loan + "]";
    }
}
