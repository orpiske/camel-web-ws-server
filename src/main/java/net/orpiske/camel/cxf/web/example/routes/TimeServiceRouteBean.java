package net.orpiske.camel.cxf.web.example.routes;

import net.orpiske.examples.cxf.webservice.TimeService;
import net.orpiske.camel.cxf.web.example.bean.TimeServiceBean;
import org.apache.camel.builder.RouteBuilder;


/**
 * Created by orpiske on 22/10/14.
 */
public class TimeServiceRouteBean extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("cxf:/TimeServiceBean?loggingFeatureEnabled=true&serviceClass="
				 + TimeService.class.getName())
			.bean(new TimeServiceBean());

	}
}
