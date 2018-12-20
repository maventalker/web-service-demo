/**
 * Project Name:web-service2
 * File Name:FineServiceImpl.java
 * Package Name:com.growithus.service.demo.service
 * Date:2018年12月20日上午9:15:45
 * Copyright (c) 2018, 杭州知时信息科技有限公司 All Rights Reserved.
 *
*/

package com.growithus.service.demo.service;


import org.slf4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.growithus.service.demo.ifc.channel.FineService;


/**
 * ClassName:FineServiceImpl <br/>
 * Function: <br/>
 * Date:     2018年12月20日 上午9:15:45 <br/>
 * @author   apple
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service(version = "${service.version}")
public class FineServiceImpl implements FineService {
    
    private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @Override
    public String areUOK(String name) {
        logger.info("web-service-2 ack = " + name);
        return "i am fine too! " +name;
    }

}

