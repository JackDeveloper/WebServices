/**
 * 
 */
package com.jackdeveloper.webservices.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jackdeveloper.webservices.entity.UsuarioEntity;

/**
 * @author javero
 *
 */
@Path("Usuario")
public class UsuarioRest {

	private List<UsuarioEntity> usuarios;

	public UsuarioRest() {
		this.usuarios = new ArrayList<UsuarioEntity>();
		this.usuarios.add(new UsuarioEntity("Jonathan", "Hernandez", 24));
		this.usuarios.add(new UsuarioEntity("Nikte", "Hernandez", 2));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUsers() {
		return Response.ok().entity(new GenericEntity<List<UsuarioEntity>>(usuarios) {}).build();
	}

}
