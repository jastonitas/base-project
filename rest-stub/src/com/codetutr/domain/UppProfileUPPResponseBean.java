package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileUPPResponseBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UppProfileMessage UPPMessage;

	public UppProfileMessage getUPPMessage() {
		return UPPMessage;
	}

	public void setUPPMessage(UppProfileMessage uPPMessage) {
		UPPMessage = uPPMessage;
	}

}