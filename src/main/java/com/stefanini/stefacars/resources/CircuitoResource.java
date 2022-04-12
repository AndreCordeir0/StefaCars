package com.stefanini.stefacars.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.stefanini.stefacars.service.CircuitoService;


@Path("/circuito")
public class CircuitoResource {
@Inject
CircuitoService circuitoService;

@GET
@Path("/todos")
public Response listarCircuito(){
    return Response.status(Response.Status.OK).entity(circuitoService.listarCircuito()).build();
}

@GET
@Path("/{id}")
public Response listarCircuitoPorId(@PathParam("id") Long id){
return Response.status(Response.Status.OK).entity(circuitoService.pegarCircuitoPorID(id)).build();
}
}
