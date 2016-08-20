package org.rathan.restutorial.messenger.model;

public class ErrorMessage {

	private String errorMessgae;
	private int errorCode;
	private String documentation;
	
	public ErrorMessage(){}
	
	public ErrorMessage(String errorMessage, int errorCode, String documentation){
		super();
		this.errorMessgae=errorMessage;
		this.errorCode=errorCode;
		this.documentation=documentation;
	}

	public String getErrorMessgae() {
		return errorMessgae;
	}

	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	
}
