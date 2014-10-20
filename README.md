Otavio's Apache Camel CXF Example: A Camel Web Application
============

This example shows how to create a simple Apache Camel WebService that runs on Glassfish 

Usage
----

To compile the code, using Apache Maven: 

```
mvn clean package
```

Note: you will need to have installed the [CXF Simple WS Types ](https://github.com/orpiske/cxf-simple-ws-types) before doing so.

To install, you can simply copy the code to GlassFish auto-deploy directory. By default it
is ${GLASSFISH_INSTALL_ROOT}/glassfish/domains/domain1/autodeploy/.


After the software is deployed, you can test the web service using SoapUI or the CXF Simple Client.
 

References
----

* [Main Site](http://orpiske.net/)
* [Apache Maven](http://maven.apache.org/)
* [Apache CXF](http://cxf.apache.org/)
