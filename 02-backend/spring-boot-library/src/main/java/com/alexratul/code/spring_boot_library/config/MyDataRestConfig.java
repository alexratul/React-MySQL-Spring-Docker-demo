package com.alexratul.code.spring_boot_library.config;

import java.awt.print.Book;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private String theAllowedOrigins = "http://localhost:3000";

    public void configureResporitoryRestConfiguration(RepositoryRestConfiguration config,
            CorsRegistry cors) {

        HttpMethod[] theUnsuppportedActions = { HttpMethod.POST,
                HttpMethod.PATCH,
                HttpMethod.DELETE,
                HttpMethod.PUT
        };

        config.exposeIdsFor(Book.class);
        disableHttpMethods(Book.class, config, theUnsuppportedActions);

        /*Configure CORS MAPPING*/
        cors.addMapping(config.getBasePath() + "/**").allowedOrigins(theAllowedOrigins);

    }

    private void disableHttpMethods(Class theclass, RepositoryRestConfiguration config,
            HttpMethod[] theUnsuppportedActions) {

        config.getExposureConfiguration().forDomainType(theclass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppportedActions));
    }


}
