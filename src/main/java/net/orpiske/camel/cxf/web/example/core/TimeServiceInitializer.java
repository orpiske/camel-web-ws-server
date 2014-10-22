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
