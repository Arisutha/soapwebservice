package com.app;

import javax.jws.WebService;

@WebService(
		serviceName = "execution",
		portName = "calculatorWsPort", 
		endpointInterface = "com.app.CalculatorWS", 
		targetNamespace = "http://www.coba.co.id/calculator")
public class Execution implements CalculatorWS{

	@Override
	public DataResult kali(DataRequest dataRequest) {
		DataResult d = new DataResult();
		d.setResult(dataRequest.nilai1 * dataRequest.nilai2);
		return d;
	}

	@Override
	public DataResult tambah(DataRequest dataRequest) {
		DataResult d = new DataResult();
		d.setResult(dataRequest.nilai1 + dataRequest.nilai2);
		return d;
	}

	@Override
	public DataResult bagi(DataRequest dataRequest) {
		DataResult d = new DataResult();
		d.setResult(dataRequest.nilai1 / dataRequest.nilai2);
		return d;
	}

	@Override
	public DataResult kurang(DataRequest dataRequest) {
		DataResult d = new DataResult();
		d.setResult(dataRequest.nilai1 - dataRequest.nilai2);
		return d;
	}

}
