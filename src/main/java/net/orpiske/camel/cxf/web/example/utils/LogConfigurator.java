/**
 Copyright 2014 Otavio Rodolfo Piske
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package net.orpiske.camel.cxf.web.example.utils;

import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

/**
 * Utility class to configure the logger
 */
public class LogConfigurator {
	/**
	 * Restricted constructor
	 */
	private LogConfigurator() {}
	
	private static void configureCommon(Properties properties) {
		
		properties.setProperty("log4j.appender.FILE",
							   "org.apache.log4j.RollingFileAppender");
		properties.setProperty("log4j.appender.FILE.File",
							   "${com.sun.aas.instanceRoot}/logs/camel-cxf-example.log");
		properties.setProperty("log4j.appender.FILE.layout", 
							   "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.FILE.layout.ConversionPattern",
							   "%d{DATE} %-5p %c{1} : %m%n");
	}
	
	private static void configureTrace(Properties properties) {
		properties.setProperty("log4j.rootLogger", "TRACE, FILE");
	}
	
	private static void configureDebug(Properties properties) {
		properties.setProperty("log4j.rootLogger", "DEBUG, FILE");
	}
	
	private static void configureVerbose(Properties properties) {
		properties.setProperty("log4j.rootLogger", "INFO, FILE");
	}

	
	/**
	 * Configure the output to be at trace level
	 */
	public static void trace() {
		Properties properties = new Properties();
		configureCommon(properties);
		configureTrace(properties);
		PropertyConfigurator.configure(properties);
	}
	/**
	 * Configure the output to be at debug level
	 */
	public static void debug() {
		Properties properties = new Properties();
		configureCommon(properties);
		configureDebug(properties);
		PropertyConfigurator.configure(properties);
	}
	
	/**
	 * Configure the output to be at verbose (info) level
	 */
	public static void verbose() {
		Properties properties = new Properties();
		configureCommon(properties);
		configureVerbose(properties);
		PropertyConfigurator.configure(properties);
	}
}
