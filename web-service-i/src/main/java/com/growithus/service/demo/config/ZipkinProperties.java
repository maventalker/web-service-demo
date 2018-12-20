package com.growithus.service.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZipkinProperties {

    @Value("${trace.brave.name}")
	private String serviceName;
    @Value("${trace.brave.address}")
	private String url;
    @Value("${trace.brave.connectTimeout}")
	private int connectTimeout;
    @Value("${trace.brave.readTimeout}")
	private int readTimeout;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}
}
