package com.stefanini.stefacars.resources;

import com.stefanini.stefacars.service.CarroService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/carro")
public class CarroResource {

    @Inject
    CarroService carroService;

    @GET
    @Path("/todos")
    public Response listarTodos() {
        var carros = carroService.listarTodos();
        return Response.status(Response.Status.OK).entity(carros).build();
    }

    @GET
    @Path("/{id}")
    public Response pegarPorId(@PathParam("id") Long id) {
        var carro = carroService.pegarPorId(id);
        return Response.status(Response.Status.OK).entity(carro).build();
    }

}
