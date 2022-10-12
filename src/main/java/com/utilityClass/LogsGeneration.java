package com.utilityClass;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsGeneration {

	public void createLogs(String infoLogs, String errorLogs) {
		
		Logger logger = LogManager.getLogger(LogsGeneration.class);
		DOMConfigurator.configure("log4j2.xml");
		
		logger.info(infoLogs);
		logger.error(errorLogs);
	}
	
	
}
