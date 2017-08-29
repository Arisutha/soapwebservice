package com.app;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://10.20.14.190:8889/ws/test.calculatorws", new Execution());
	}
}
