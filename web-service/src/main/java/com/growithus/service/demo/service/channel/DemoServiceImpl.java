package com.growithus.service.demo.service.channel;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.growithus.service.demo.ifc.channel.DemoService;
import com.growithus.service.demo.ifc.channel.FineService;

@Service(version = "${service.version}")
public class DemoServiceImpl implements DemoService {
    
    @Reference(version = "${service.version}")
    FineService fineService;

	/*
	 * 当前端找不到provider时，会调用mock服务，默认位于接口同一目录下
	 * 
	 * @see
	 * com.growithus.service.demo.ifc.channel.DemoService#hello(java.lang.String)
	 */
	@Transactional
	public String hello(String input) {
	    String ack = fineService.areUOK(input);
		return "hello " + input + ", spring boot dubbo!,i call web-service-2,it ack that  " + ack;
	}

}
