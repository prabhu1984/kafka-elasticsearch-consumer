package org.elasticsearch.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FailedEventsLogger {

	private static final Logger logger = LoggerFactory.getLogger(FailedEventsLogger.class);

	public static void logFailedEvent(String errorMsg, String event){
		logger.error("General Error Processing Event: ERROR: {}, EVENT: {}", errorMsg, event);
	}

	public static void logFailedToPostToESEvent(String errorMsg, String event){
		logger.error("Error posting event to ES: ERROR: {}, EVENT: {}", errorMsg, event);
	}

	public static void logFailedToTransformEvent(long offset, String errorMsg, String event){
		logger.error("Error transforming event: ERROR: {}, OFFSET: {}, EVENT: {}", 
				offset, errorMsg, event);
	}

}