package com.scanner.bank;

import java.util.Set;

public class Account {
	String accountNumber;
    Set accountType;
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Account(String accountNumber, Set accountType) {
        super();
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Set getAccountType() {
        return accountType;
    }
    public void setAccountType(Set accountType) {
        this.accountType = accountType;
    }
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + "]";
    }
    
	
}
