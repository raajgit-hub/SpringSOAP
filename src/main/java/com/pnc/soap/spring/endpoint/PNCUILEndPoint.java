package com.pnc.soap.spring.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PNCUILEndPoint {
	private static final String NAMESPACE_URI = "http://fairisaac.com/ScoreNet/EntryPoint";
	
	@PayloadRoot(namespace=NAMESPACE_URI, localPart = "SubmitRequest")
	@ResponsePayload
	public String submitRequest(@RequestPayload String inputXml) {
		String outputXml = "<PNCResponse></PNCResponse>";
		
		return outputXml;
	}
}
