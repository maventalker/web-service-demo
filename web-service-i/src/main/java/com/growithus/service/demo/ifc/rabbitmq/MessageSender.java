package com.growithus.service.demo.ifc.rabbitmq;

/**
 * 消息推送
 * 
 * @author guooo 2018年10月29日 下午4:08:54
 * 
 */
public interface MessageSender {

	/**
	 * 短信发送
	 * 
	 * @param msgString
	 */
	void sendSMS(String msgString);

	/**
	 * 手机App推送
	 * 
	 * @param msgString
	 */
	void sendAppPush(String msgString);
}
