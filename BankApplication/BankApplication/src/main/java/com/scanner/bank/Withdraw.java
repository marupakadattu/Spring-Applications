package com.scanner.bank;

import java.util.Set;

public class Withdraw {
	Set withDrawType;
	String withDrawId;
	public Withdraw() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	public Withdraw(Set withDrawType, String withDrawId) {
	    super();
	    this.withDrawType = withDrawType;
	    this.withDrawId = withDrawId;
	}
	public Set getWithDrawType() {
	    return withDrawType;
	}
	public void setWithDrawType(Set withDrawType) {
	    this.withDrawType = withDrawType;
	}
	public String getWithDrawId() {
	    return withDrawId;
	}
	public void setWithDrawId(String withDrawId) {
	    this.withDrawId = withDrawId;
	}
	@Override
	public String toString() {
	    return "Withdraw [withDrawType=" + withDrawType + ", withDrawId=" + withDrawId + "]";
	}

	 
}
