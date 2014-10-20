package net.orpiske.camel.cxf.web.example.core;

import net.orpiske.camel.cxf.web.example.utils.LogConfigurator;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by orpiske on 20/10/14.
 */
public class TimeServiceInitializer implements WebApplicationInitializer {

	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/**
		 * We initialize the log4j configuration during server startup, so we can log 
		 * it to a separate file instead of the server.log file
		 */
		LogConfigurator.verbose();
	}
}
