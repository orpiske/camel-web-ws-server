package net.orpiske.camel.cxf.web.example.routes;

import net.orpiske.camel.cxf.web.example.processors.TimeServiceProcessor;
import net.orpiske.examples.cxf.webservice.TimeService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;

/**
 * Created by orpiske on 20/10/14.
 */
public class TimeServiceRoute extends RouteBuilder {
	private static final Logger logger = Logger.getLogger(TimeServiceRoute.class);

	@Override
	public void configure() throws Exception {
		from("cxf:/TimeService?dataFormat=POJO&serviceClass=" 
				 + TimeService.class.getName())
			.routeId("TimeService")
			.process(new TimeServiceProcessor());
			
	}
}
