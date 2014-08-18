package com.codetutr.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class UppProfileRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String RequestId;
	private String Version;
	private Timestamp Timestamp;
	private UppProfileRequestPayload Payload;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public Timestamp getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}

	public UppProfileRequestPayload getPayload() {
		return Payload;
	}

	public void setPayload(UppProfileRequestPayload payload) {
		Payload = payload;
	}

}