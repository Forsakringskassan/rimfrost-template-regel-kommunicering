package se.fk.github.regeltemplate.logic;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.handlaggning.model.Handlaggning;
import se.fk.rimfrost.framework.handlaggning.model.HandlaggningUpdate;
import se.fk.rimfrost.framework.regel.kommunicering.logic.RegelKommuniceringService;
import se.fk.rimfrost.template.regel.kommunicering.openapi.jaxrsspec.controllers.generatedsource.model.GetDataResponse; // TODO byt ut mot regelns API
import se.fk.rimfrost.template.regel.kommunicering.openapi.jaxrsspec.controllers.generatedsource.model.PatchDataRequest; // TODO byt ut mot regelns API

/**
 * Implementering av {@link RegelKommuniceringService}.
 * Byt ut {@code GetDataResponse} och {@code PatchDataRequest} mot klasser genererad från regelns OpenAPI-spec.
 * Implementera varje metod med regelns affärslogik.
 */
@ApplicationScoped
public class RegelTemplateService implements RegelKommuniceringService<GetDataResponse, PatchDataRequest>
{
    /**
     * TODO: Implementera — extrahera relevant data från handläggningen och populera svarsobjektet.
     */
    @Override
    public GetDataResponse read(Handlaggning handlaggning) // TODO byt ut GetDataResponse mot klass genererad från regelns OpenAPI-spec
    {
        // TODO to be implemented: regelns logik för att skapa response
        var response = new GetDataResponse();
        return response;
    }

    /**
     * TODO: Implementera — applicera handläggarens svar för att uppdatera handläggningen.
     */
    @Override
    public HandlaggningUpdate update(Handlaggning handlaggning, PatchDataRequest request) // TODO byt ut PatchDataRequest mot klass genererad från regelns OpenAPI-spec
    {
        return null; // TODO to be implemented: uppdatera data från PatchDataRequest request
    }
}
