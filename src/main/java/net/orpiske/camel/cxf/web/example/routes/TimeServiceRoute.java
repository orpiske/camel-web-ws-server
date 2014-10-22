package net.orpiske.camel.cxf.web.example.routes;

import net.orpiske.camel.cxf.web.example.processors.TimeServiceProcessor;
import net.orpiske.examples.cxf.webservice.TimeService;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by orpiske on 20/10/14.
 */
public class TimeServiceRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("cxf:/TimeService?loggingFeatureEnabled=true&serviceClass=" 
				 + TimeService.class.getName())
			.routeId("TimeService")
			.process(new TimeServiceProcessor());
	}
}
