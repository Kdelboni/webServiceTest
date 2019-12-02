package br.com.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.dao.ClienteDao;
import br.com.model.Cliente;

public class ClienteService implements Serializable{
	
	@Inject
	private ClienteDao clienteDao;
	
	public List<Cliente> listarCliente(){
		return clienteDao.listarCliente();
	}
	

}
