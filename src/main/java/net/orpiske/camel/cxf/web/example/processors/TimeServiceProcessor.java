package net.orpiske.camel.cxf.web.example.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by orpiske on 20/10/14.
 */
@Controller
public class TimeServiceProcessor implements Processor {
	private static final Logger logger = Logger.getLogger(TimeServiceProcessor.class);
	
	public XMLGregorianCalendar timeService() {

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
	
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("Processing a time service request");
	
		Object object = exchange.getIn().getBody();

		if (object instanceof MessageContentsList) {
			MessageContentsList messageContentsList = (MessageContentsList) object;
			
			exchange.getOut().setBody(new Object[] { timeService() } );

			logger.debug("Setting up reply message");
		}
		else {
			logger.error("Unhandled message type: " + (object == null ? "null"
																	  : object.getClass()));
		}
		
	}
}
