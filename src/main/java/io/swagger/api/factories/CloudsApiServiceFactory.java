package io.swagger.api.factories;

import io.swagger.api.CloudsApiService;
import io.swagger.api.impl.CloudsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-29T22:14:36.945Z[GMT]")public class CloudsApiServiceFactory {
    private final static CloudsApiService service = new CloudsApiServiceImpl();

    public static CloudsApiService getCloudsApi() {
        return service;
    }
}
