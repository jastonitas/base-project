package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileRequestBeanTransactionSource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String SourceName;

	public String getSourceName() {
		return SourceName;
	}

	public void setSourceName(String sourceName) {
		SourceName = sourceName;
	}

}