package com.conversion.PojoToJsonFile;

public class CommunicationMessageObject {
int trackingId;
int cimNumber;
int caseNumber;
String carrier;
String owningCarrier;
DocumentTypeObject doucmentTypeObject;
int priority;
DemographicDetailsObject demographicDetailsObject;
RecepientDetailsObject recepientDetailsObject; 
CoverageDetailsObject coverageDetailsObject;
StatusObject statusObject;
PaymentObject paymentObject;
public int getTrackingId() {
	return trackingId;
}
public void setTrackingId(int trackingId) {
	this.trackingId = trackingId;
}
public int getCimNumber() {
	return cimNumber;
}
public void setCimNumber(int cimNumber) {
	this.cimNumber = cimNumber;
}
public int getCaseNumber() {
	return caseNumber;
}
public void setCaseNumber(int caseNumber) {
	this.caseNumber = caseNumber;
}
public String getCarrier() {
	return carrier;
}
public void setCarrier(String carrier) {
	this.carrier = carrier;
}
public String getOwningCarrier() {
	return owningCarrier;
}
public void setOwningCarrier(String owningCarrier) {
	this.owningCarrier = owningCarrier;
}
public DocumentTypeObject getDoucmentTypeObject() {
	return doucmentTypeObject;
}
public void setDoucmentTypeObject(DocumentTypeObject doucmentTypeObject) {
	this.doucmentTypeObject = doucmentTypeObject;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public DemographicDetailsObject getDemographicDetailsObject() {
	return demographicDetailsObject;
}
public void setDemographicDetailsObject(DemographicDetailsObject demographicDetailsObject) {
	this.demographicDetailsObject = demographicDetailsObject;
}
public RecepientDetailsObject getRecepientDetailsObject() {
	return recepientDetailsObject;
}
public void setRecepientDetailsObject(RecepientDetailsObject recepientDetailsObject) {
	this.recepientDetailsObject = recepientDetailsObject;
}
public CoverageDetailsObject getCoverageDetailsObject() {
	return coverageDetailsObject;
}
public void setCoverageDetailsObject(CoverageDetailsObject coverageDetailsObject) {
	this.coverageDetailsObject = coverageDetailsObject;
}
public StatusObject getStatusObject() {
	return statusObject;
}
public void setStatusObject(StatusObject statusObject) {
	this.statusObject = statusObject;
}
public PaymentObject getPaymentObject() {
	return paymentObject;
}
public void setPaymentObject(PaymentObject paymentObject) {
	this.paymentObject = paymentObject;
}

}
