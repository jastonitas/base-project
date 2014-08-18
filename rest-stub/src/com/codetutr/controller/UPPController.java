package com.codetutr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codetutr.domain.UppProfileRequest;
import com.codetutr.domain.UppProfileResponse;
import com.codetutr.domain.UppProfileResponseBean;
import com.codetutr.domain.UppProfileUPPMessage;

@Controller
@RequestMapping("/upp")
public class UPPController {
	
	Logger LOG = LoggerFactory.getLogger(UPPController.class);

	@RequestMapping("profile")
	public @ResponseBody UppProfileResponse randomPerson(@RequestBody UppProfileRequest request) {
		LOG.info("invoked ... upp/profile");
		UppProfileResponse response = new UppProfileResponse();
		UppProfileResponseBean profileResponse = new UppProfileResponseBean();
		UppProfileUPPMessage message = new UppProfileUPPMessage();
		message.setMessageCode("C545433");
		message.setMessageText("Text Message");
		profileResponse.setMessage(message);
		response.setProfileResponse(profileResponse);
		return response;
	}

}