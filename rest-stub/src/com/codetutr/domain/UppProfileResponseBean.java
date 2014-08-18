package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileResponseBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UppProfilePayload Payload;
	private UppProfileUPPMessage Message;

	public UppProfilePayload getPayload() {
		return Payload;
	}

	public void setPayload(UppProfilePayload payload) {
		Payload = payload;
	}

	public UppProfileUPPMessage getMessage() {
		return Message;
	}

	public void setMessage(UppProfileUPPMessage message) {
		Message = message;
	}

}