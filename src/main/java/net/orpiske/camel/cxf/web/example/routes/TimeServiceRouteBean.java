package net.orpiske.camel.cxf.web.example.routes;

import org.apache.log4j.Logger;
import net.orpiske.examples.cxf.webservice.TimeService;
import net.orpiske.camel.cxf.web.example.bean.TimeServiceBean;
import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;


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
