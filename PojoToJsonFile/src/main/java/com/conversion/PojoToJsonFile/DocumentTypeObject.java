package com.conversion.PojoToJsonFile;

public class DocumentTypeObject {
String documentCode;
boolean isEmail;
boolean isSMS;
public String getDocumentCode() {
	return documentCode;
}
public void setDocumentCode(String documentCode) {
	this.documentCode = documentCode;
}
public boolean isEmail() {
	return isEmail;
}
public void setEmail(boolean isEmail) {
	this.isEmail = isEmail;
}
public boolean isSMS() {
	return isSMS;
}
public void setSMS(boolean isSMS) {
	this.isSMS = isSMS;
}

}
