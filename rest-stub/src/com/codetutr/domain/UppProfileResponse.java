package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private UppProfileResponseBean ProfileResponse;

	public UppProfileResponseBean getProfileResponse() {
		return ProfileResponse;
	}

	public void setProfileResponse(UppProfileResponseBean profileResponse) {
		ProfileResponse = profileResponse;
	}

}