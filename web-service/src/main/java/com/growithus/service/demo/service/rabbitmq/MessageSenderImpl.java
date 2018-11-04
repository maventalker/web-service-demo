/*package com.growithus.service.demo.service.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.fenbei.chexian.biz.ifc.rabbitmq.MessageSender;

@Service(version = "${service.version}")
public class MessageSenderImpl implements MessageSender {

	@Value(value = "${rabbitmq.queue.sms}")
	private String sms_queue;

	@Value(value = "${rabbitmq.queue.push}")
	private String app_push_queue;

	@Autowired
	AmqpTemplate amqpTemplate;

	@Override
	public void sendSMS(String msgString) {
		amqpTemplate.convertAndSend(sms_queue, msgString);
	}

	@Override
	public void sendAppPush(String msgString) {
		amqpTemplate.convertAndSend(app_push_queue, msgString);
	}

}
*/