package com.zhangwei.dongwu.net;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;

public class DownloadHelper {

	private static DownloadHelper ins = null;

	private DownloadHelper() {

	}

	public static DownloadHelper getInstance() {
		if (ins == null) {
			ins = new DownloadHelper();
		}

		return ins;
	}

	public String DownloadFile(String url, String save_path) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(url);
		HttpResponse response;
		try {
			//httpclient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpRequestRetryHandler());
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream instream = entity.getContent();
				int l;
				byte[] tmp = new byte[2048];
				while ((l = instream.read(tmp)) != -1) {
				}
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
