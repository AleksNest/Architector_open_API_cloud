package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Cloud;
import io.swagger.model.Error;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-29T22:14:36.945Z[GMT]")public abstract class CloudsApiService {
    public abstract Response cencelCloudById(String cloudId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCloud(Error body,String CPU,String HDD,String RAM,String OS,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllClouds(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCloudById(String cloudId,SecurityContext securityContext) throws NotFoundException;
}
