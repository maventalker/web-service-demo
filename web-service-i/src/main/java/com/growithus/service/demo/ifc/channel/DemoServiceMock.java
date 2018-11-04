package com.growithus.service.demo.ifc.channel;

import com.growithus.service.demo.ifc.channel.DemoService;

/**
 * demoService mock
 * @author guooo 2018年10月26日 下午2:09:49
 * 
 */
public class DemoServiceMock implements DemoService {

	public String hello(String input) {
		return "mock service return";
	}

}
