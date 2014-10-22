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
