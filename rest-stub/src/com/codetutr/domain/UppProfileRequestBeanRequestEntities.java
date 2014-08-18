package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileRequestBeanRequestEntities implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String People;
	private String Profile;
	private String Employer;
	private String Source;

	public String getPeople() {
		return People;
	}

	public void setPeople(String people) {
		People = people;
	}

	public String getProfile() {
		return Profile;
	}

	public void setProfile(String profile) {
		Profile = profile;
	}

	public String getEmployer() {
		return Employer;
	}

	public void setEmployer(String employer) {
		Employer = employer;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

}