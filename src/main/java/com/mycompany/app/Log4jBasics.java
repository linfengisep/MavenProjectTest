package com.mycompany.app;

import org.apache.log4j.*;

public class Log4jBasics{

	protected static org.apache.log4j.Logger log = Logger.getLogger(Log4jBasics.class);

	public static void main(String[] args) {
			log.debug("DEBUG: cool!");
			log.info("INFO: cool!");
	}
}
