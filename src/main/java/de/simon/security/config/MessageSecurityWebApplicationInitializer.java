package de.simon.security.config;

import org.springframework.security.web.context.*;

import de.simon.security.messages.RootConfiguration;

public class MessageSecurityWebApplicationInitializer
extends AbstractSecurityWebApplicationInitializer {
	
	protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfiguration.class };
    }
}
