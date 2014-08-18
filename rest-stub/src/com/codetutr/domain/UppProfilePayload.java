package com.codetutr.domain;

import java.io.Serializable;

public class UppProfilePayload implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UppProfileUPPResponseBean UPPResponse;

	public UppProfileUPPResponseBean getUPPResponse() {
		return UPPResponse;
	}

	public void setUPPResponse(UppProfileUPPResponseBean uPPResponse) {
		UPPResponse = uPPResponse;
	}

}