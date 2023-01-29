package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CloudsApiService;
import io.swagger.api.factories.CloudsApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Cloud;
import io.swagger.model.Error;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/clouds")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-29T22:14:36.945Z[GMT]")public class CloudsApi  {
   private final CloudsApiService delegate;

   public CloudsApi(@Context ServletConfig servletContext) {
      CloudsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CloudsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CloudsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CloudsApiServiceFactory.getCloudsApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{cloud_id}")
    
    @Produces({ "adplication/json" })
    @Operation(summary = "Метод отмены заказа на облако по ID", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ заказом облака по ID"),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Response cencelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака",required=true) @PathParam("cloud_id") String cloudId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cencelCloudById(cloudId,securityContext);
    }
    @POST
    @Path("/{CPU}/{HDD}/{RAM}/{OS}")
    @Consumes({ "adplication/json" })
    @Produces({ "adplication/json" })
    @Operation(summary = "Метод создания заказа на облако", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ создания заказа в облаке", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Response createCloud(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) Error body

,@Parameter(in = ParameterIn.PATH, description = "количество ядер CPU",required=true) @PathParam("CPU") String CPU
,@Parameter(in = ParameterIn.PATH, description = "объем HDD",required=true) @PathParam("HDD") String HDD
,@Parameter(in = ParameterIn.PATH, description = "объем RAM",required=true) @PathParam("RAM") String RAM
,@Parameter(in = ParameterIn.PATH, description = "операционная система",required=true) @PathParam("OS") String OS
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCloud(body,CPU,HDD,RAM,OS,securityContext);
    }
    @GET
    
    
    @Produces({ "adplication/json" })
    @Operation(summary = "Метод получения списка ресурсов на облако", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком ресурсов в облаке", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Response getAllClouds(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllClouds(securityContext);
    }
    @GET
    @Path("/{cloud_id}")
    
    @Produces({ "adplication/json" })
    @Operation(summary = "Метод получения заказа ресурсов на облако по ID", description = "", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ заказом облака по ID", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Response getCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака",required=true) @PathParam("cloud_id") String cloudId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCloudById(cloudId,securityContext);
    }
}
