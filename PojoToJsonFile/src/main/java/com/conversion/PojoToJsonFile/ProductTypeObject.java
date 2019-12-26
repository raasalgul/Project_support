package com.conversion.PojoToJsonFile;

import java.util.Date;

public class ProductTypeObject {
Date effectiveDate;
Date termDate;
int planId;
String planName;
String coverageType;
int premiumAmount;
public Date getEffectiveDate() {
	return effectiveDate;
}
public void setEffectiveDate(Date effectiveDate) {
	this.effectiveDate = effectiveDate;
}
public Date getTermDate() {
	return termDate;
}
public void setTermDate(Date termDate) {
	this.termDate = termDate;
}
public int getPlanId() {
	return planId;
}
public void setPlanId(int planId) {
	this.planId = planId;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public String getCoverageType() {
	return coverageType;
}
public void setCoverageType(String coverageType) {
	this.coverageType = coverageType;
}
public int getPremiumAmount() {
	return premiumAmount;
}
public void setPremiumAmount(int premiumAmount) {
	this.premiumAmount = premiumAmount;
}

}
