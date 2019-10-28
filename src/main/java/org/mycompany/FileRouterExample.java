package org.mycompany;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class FileRouterExample extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("file:C:/ftpTest/inbound?noop=true")
        	.to("file:C:/ftpTest/outbound?doneFilename=123.txt");
    }

}