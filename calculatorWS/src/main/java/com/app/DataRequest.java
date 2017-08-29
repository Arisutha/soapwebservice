package com.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataRequest", propOrder = { 
		"nilai1",
		"nilai2"
	})
public class DataRequest {

	@XmlElement(nillable = true)
	protected double nilai1;
	@XmlElement(nillable = true)
	protected double nilai2;

	public double getNilai1() {
		return nilai1;
	}

	public void setNilai1(double nilai1) {
		this.nilai1 = nilai1;
	}

	public double getNilai2() {
		return nilai2;
	}

	public void setNilai2(double nilai2) {
		this.nilai2 = nilai2;
	}

}
