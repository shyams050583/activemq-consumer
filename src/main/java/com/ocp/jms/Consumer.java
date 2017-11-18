package com.ocp.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
	
	@JmsListener(destination = "consumer.VirtualTopic.Test")
	public void receiveMessage(String msg) {
		
		LOGGER.info(msg);
		
	}
	
}
