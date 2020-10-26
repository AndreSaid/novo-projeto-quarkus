package com.novoprojeto.nick;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categoria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {

	@Inject
	private CategoriaRepository repo;
    
    @GET
    public List<Categoria> listarCategorias() {
    	return repo.listAll();
    }
    
    @POST
    @Transactional
    public Categoria salvarCategoria(Categoria categoria) {
    	categoria.persist();
    	return categoria;
    }
}
