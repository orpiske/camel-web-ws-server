package net.orpiske.camel.cxf.web.example.bean;

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
	
	public XMLGregorianCalendar timeService() {
		logger.info("Processing a new time service request");
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		try {
			XMLGregorianCalendar ret = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			return ret;
		} catch (DatatypeConfigurationException e) {

			e.printStackTrace();
		}

		return null;
	}
}
