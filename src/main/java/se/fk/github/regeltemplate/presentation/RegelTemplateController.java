package se.fk.github.regeltemplate.presentation;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import se.fk.rimfrost.framework.regel.kommunicering.presentation.rest.RegelKommuniceringController;
import se.fk.rimfrost.template.regel.kommunicering.openapi.jaxrsspec.controllers.generatedsource.model.GetDataResponse; // TODO byt ut mot regelns API
import se.fk.rimfrost.template.regel.kommunicering.openapi.jaxrsspec.controllers.generatedsource.model.PatchDataRequest; // TODO byt ut mot regelns API

/**
 * Template för kommuniceringsregler.
 * Byt ut {@code GetDataResponse} och {@code PatchDataRequest} mot klasser genererad från regelns OpenAPI-spec
 * och döp om {@code @Path} till regelns endpoint.
 */
@Produces("application/json")
@Consumes("application/json")
@Path("/regel/regel-template-kommunicering") // TODO to be renamed
@ApplicationScoped
public class RegelTemplateController extends RegelKommuniceringController<GetDataResponse, PatchDataRequest> // TODO byt ut till klasser genererade från regelns OpenAPI-spec
{
}
