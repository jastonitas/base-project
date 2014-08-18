package com.codetutr.domain;

import java.io.Serializable;

public class UppProfileRequestBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UppProfileRequestBeanTransactionSource TransactionSource;
	private UppProfileRequestBeanRequestEntities RequestEntities;

	public UppProfileRequestBeanTransactionSource getTransactionSource() {
		return TransactionSource;
	}

	public void setTransactionSource(UppProfileRequestBeanTransactionSource transactionSource) {
		TransactionSource = transactionSource;
	}

	public UppProfileRequestBeanRequestEntities getRequestEntities() {
		return RequestEntities;
	}

	public void setRequestEntities(UppProfileRequestBeanRequestEntities requestEntities) {
		RequestEntities = requestEntities;
	}

}