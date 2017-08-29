package com.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "calculatorws", targetNamespace = "http://www.coba.co.id/calculator")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {

	@WebMethod(operationName = "kali")
	@WebResult(name = "dataResult", targetNamespace = "http://www.coba.co.id/calculator/kali", partName = "parameters")
	public DataResult kali(
			@WebParam(name = "dataRequest", targetNamespace = "http://www.coba.co.id/calculator/kali", partName = "parameters")
			DataRequest dataRequest);
	
	@WebMethod(operationName = "tambah")
	@WebResult(name = "dataResult", targetNamespace = "http://www.coba.co.id/calculator/tambah", partName = "parameters")
	public DataResult tambah(
			@WebParam(name = "dataRequest", targetNamespace = "http://www.coba.co.id/calculator/tambah", partName = "parameters")
			DataRequest dataRequest);
	
	@WebMethod(operationName = "bagi")
	@WebResult(name = "dataResult", targetNamespace = "http://www.coba.co.id/calculator/bagi", partName = "parameters")
	public DataResult bagi(
			@WebParam(name = "dataRequest", targetNamespace = "http://www.coba.co.id/calculator/bagi", partName = "parameters")
			DataRequest dataRequest);
	
	@WebMethod(operationName = "kurang")
	@WebResult(name = "dataResult", targetNamespace = "http://www.coba.co.id/calculator/kurang", partName = "parameters")
	public DataResult kurang(
			@WebParam(name = "dataRequest", targetNamespace = "http://www.coba.co.id/calculator/kurang", partName = "parameters")
			DataRequest dataRequest);
	
	
	
}
