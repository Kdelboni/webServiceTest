package br.com.ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.model.Cliente;

@Path("/usuario")
public class ClienteWs implements Serializable {

	List<Cliente> listagem = new ArrayList<Cliente>();

	public ClienteWs() {		
		listagem.add(new Cliente(1,"Login", "Senha"));
//		http://10.12.5.163:8080/ServiceTeste/faces/cliente/user

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	public String listar() {
		System.out.println("passou aqui");
		return new Gson().toJson(listagem);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	public Cliente getTestService(String json) {
		Cliente teste = new Cliente();
		System.out.println("Usuario logado : " + json);
		return 	teste;
	}
	
	
	
	

}
