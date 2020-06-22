package com.uptech.smarthomeimplmqtt.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import android.util.Base64;
import android.util.Log;

import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.utils.Const;

public class BasicHttpHandler extends httpHandlerimpl{

	private static final String TAG = "BasicHttpHandler";
	private MyApplication app;
	private BasicHttpParams connParams;
	private HttpClient httpclient;
	private HttpContext context;
	private HttpGet httpGet;
	private HttpResponse httpResponse;
	public BasicHttpHandler(MyApplication app)
	{
		this.app = app;
		connParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(connParams, Const.TIME_OUT * 1000);
		HttpConnectionParams.setSoTimeout(connParams, Const.TIME_OUT * 1000);
		httpclient = new DefaultHttpClient(connParams);
		context = new BasicHttpContext();
		HttpHost targetHost = new HttpHost(app.getCamera_IpStr(),app.getCamera_Port());
		context.setAttribute(ClientContext.CREDS_PROVIDER,new BasicCredentialsProvider());
		CredentialsProvider provider = (CredentialsProvider) context.getAttribute(ClientContext.CREDS_PROVIDER);
		provider.setCredentials(new AuthScope(targetHost.getHostName(),targetHost.getPort()),
				new UsernamePasswordCredentials(app.getCamera_UserName(),app.getCamera_Paswd()));
		httpGet = new HttpGet();
		setHeader();
	}

	public String getHttpHost(String string) {
		StringBuilder builder = new StringBuilder("http://");
		builder.append(app.getCamera_IpStr());
		builder.append(":");
		builder.append(app.getCamera_Port());
		builder.append("/");
		builder.append(string);
		return builder.toString();
	}
	public void setURI(String url) throws URISyntaxException {
		Log.i(TAG, url);
		httpGet.setURI(new URI(url));
	}


	public HashMap<String, String> getHttpReponseHead() {
		if(this.httpResponse == null)
			return null;
		HashMap<String, String> localHashMap = new HashMap<String, String>();
			Header[] arrayOfHeader =this.httpResponse.getAllHeaders();
			for (int i = 0;; i++) {
				if (i >= arrayOfHeader.length)
					return localHashMap;
				localHashMap.put(arrayOfHeader[i].getName().toLowerCase(Locale.getDefault()), arrayOfHeader[i].getValue());
			}
	}

	public void logHttpResponseHeadInfo()
	{
		if(this.httpResponse == null)
			return;
		Header[] arrayOfHeader = this.httpResponse.getAllHeaders();
		for(int i = 0 ; i < arrayOfHeader.length ; i ++)
		{
			Log.e(TAG, "name: "+arrayOfHeader[i].getName()+"  --  value:"+ arrayOfHeader[i].getValue());
		}
	}
	

	public void logHttpQuestHeadInfo()
	{
		if(this.httpGet == null)
			return;
		Header[] arrayOfHeader = this.httpGet.getAllHeaders();
		for(int i = 0 ; i < arrayOfHeader.length ; i ++)
		{
			Log.e(TAG, "name: "+arrayOfHeader[i].getName()+"  --  value:"+ arrayOfHeader[i].getValue());
		}
	}

	public int execResponse() throws ClientProtocolException, IOException {
		httpResponse = httpclient.execute(httpGet, context);
//		httpResponse = httpclient.execute(httpGet);
		return httpResponse.getStatusLine().getStatusCode();
	}

	public void setHeader(){
		httpGet.addHeader("Connection", "keep-alive");
		httpGet.addHeader("host", app.getCamera_IpStr());
		httpGet.addHeader("Cache-Control","no-cache");
		httpGet.addHeader("Authorization", this.authenticate(app.getCamera_UserName() + ":" + app.getCamera_Paswd()));
	}
	

	public String authenticate(String namevaluepair){
		return "Basic "+Base64.encodeToString(namevaluepair.getBytes(), Base64.DEFAULT);
	}

	@Override
	public HttpResponse getHttpResponse() {
		return this.httpResponse;
	}
}
