package com.uptech.smarthomeimplmqtt.http;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;

public class httpHandlerimpl implements HttpHandler{

	@Override
	public String ptz_control(int command) {
		StringBuilder builder = new StringBuilder();
		builder.append(getHttpHost("decoder_control.cgi"));
		builder.append("?command=");
		builder.append(command);
		return builder.toString();
	}

	@Override
	public String camera_control(String param, int value) {
		StringBuilder builder = new StringBuilder();
		builder.append(getHttpHost("camera_control.cgi"));
		builder.append("?param=");
		builder.append(param);
		builder.append("&value=");
		builder.append(value);
		return builder.toString();
	}

	@Override
	public void setURI(String url) throws URISyntaxException {
	}

	@Override
	public HashMap<String, String> getHttpReponseHead() {
		return null;
	}

	@Override
	public void logHttpResponseHeadInfo() {
	}

	@Override
	public void logHttpQuestHeadInfo() {
	}

	@Override
	public String getHttpHost(String string) {
		return null;
	}

	@Override
	public int execResponse() throws ClientProtocolException, IOException {
		return 0;
	}

	@Override
	public void setHeader() {
		
	}

	@Override
	public String getParamString(List<NameValuePair> params) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<params.size(); i++)
		{
			builder.append("&");
			builder.append(params.get(i).getName());
			builder.append("=");
			builder.append(params.get(i).getValue());
		}
		return builder.toString();
	}

	@Override
	public HttpResponse getHttpResponse() {
		return null;
	}

}
