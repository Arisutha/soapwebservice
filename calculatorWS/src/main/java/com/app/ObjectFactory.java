package com.app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	private final static QName _ExecuteCollectionRequestDoc_QNAME = new QName(
			"http://www.coba.co.id/calculator", "dataRequest");
	private final static QName _ExecuteCollectionResponseDoc_QNAME = new QName(
			"http://www.coba.co.id/calculator", "dataResult");

	public ObjectFactory() {
	}

	public DataRequest createDataRequest() {
		return new DataRequest();
	}

	public DataResult createDataResult() {
		return new DataResult();
	}

	
	@XmlElementDecl(namespace = "http://www.coba.co.id/calculator", name = "dataRequest")
	public JAXBElement<DataRequest> createExecuteCollectionRequestDoc(DataRequest value) {
		return new JAXBElement<DataRequest>(_ExecuteCollectionRequestDoc_QNAME, DataRequest.class, null, value);
	}

	@XmlElementDecl(namespace = "http://www.coba.co.id/calculator", name = "dataResult")
	public JAXBElement<DataResult> createExecuteCollectionResponseDoc(DataResult value) {
		return new JAXBElement<DataResult>(_ExecuteCollectionResponseDoc_QNAME, DataResult.class, null, value);
	}
}
