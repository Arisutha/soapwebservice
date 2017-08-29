package com.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataResult", propOrder = { "result" })
public class DataResult {
	@XmlElement(nillable = true)
	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
