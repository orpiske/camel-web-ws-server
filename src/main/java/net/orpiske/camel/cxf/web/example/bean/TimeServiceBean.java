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
package net.orpiske.camel.cxf.web.example.bean;

import net.orpiske.camel.cxf.web.example.exceptions.TimeServiceException;
import org.apache.log4j.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by orpiske on 22/10/14.
 */
public class TimeServiceBean {
	private static final Logger logger = Logger.getLogger(TimeServiceBean.class);
	
	public XMLGregorianCalendar timeService() throws TimeServiceException {
		logger.info("Obtaining current time");
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		try {
			XMLGregorianCalendar ret = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			return ret;
		} catch (DatatypeConfigurationException e) {
			throw new TimeServiceException("Unable to obtain current time", e);
		}
	}
}
