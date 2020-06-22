package com.uptech.smarthomeimplmqtt.http;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;

public interface HttpHandler {

	public String ptz_control(int command);

	public String camera_control(String param, int value);

	public void setURI(String url) throws URISyntaxException;

	public HashMap<String, String> getHttpReponseHead();

	public void logHttpResponseHeadInfo();

	public void logHttpQuestHeadInfo();
	
	public String getHttpHost(String string);

	public int execResponse() throws ClientProtocolException, IOException;

	public void setHeader();
	
	public String getParamString(List<NameValuePair> params);
	
	public HttpResponse getHttpResponse();
}