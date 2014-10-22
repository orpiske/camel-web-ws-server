package net.orpiske.camel.cxf.web.example.processors;

import net.orpiske.camel.cxf.web.example.bean.TimeServiceBean;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;

/**
 * Created by orpiske on 20/10/14.
 */
public class TimeServiceProcessor implements Processor {
	private static final Logger logger = Logger.getLogger(TimeServiceProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("Processing a time service request");
	
		Object object = exchange.getIn().getBody();

		if (object instanceof MessageContentsList) {
			/**
			 * If we needed to get the contents of the message, we could do this:
			 * 
			 * MessageContentsList messageContentsList = (MessageContentsList) object;
			 * 
			 * Holder<DataType> someData = (Holder<DataType>)  messageContentsList.get(<pos>);
			 */
						
			exchange.getOut().setBody(new Object[] { new TimeServiceBean().timeService() } );

			logger.debug("Setting up reply message");
		}
		else {
			logger.error("Unhandled message type: " + (object == null ? "null"
																	  : object.getClass()));
		}
	}
}
