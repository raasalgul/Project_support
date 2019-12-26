package com.conversion.PojoToJsonFile;

import java.util.Date;

public class PaymentObject {
int transactionAmount;
Date transactionDate;
Date amountDueDate;
Date billPeriod;
public int getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(int transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public Date getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}
public Date getAmountDueDate() {
	return amountDueDate;
}
public void setAmountDueDate(Date amountDueDate) {
	this.amountDueDate = amountDueDate;
}
public Date getBillPeriod() {
	return billPeriod;
}
public void setBillPeriod(Date billPeriod) {
	this.billPeriod = billPeriod;
}

}
