package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileRequestPayload implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UppProfileRequestBean UPPRequest;

	public UppProfileRequestBean getUPPRequest() {
		return UPPRequest;
	}

	public void setUPPRequest(UppProfileRequestBean uPPRequest) {
		UPPRequest = uPPRequest;
	}

}