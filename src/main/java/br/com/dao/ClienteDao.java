package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.model.Cliente;

public class ClienteDao {
	
	private EntityManager em;
	
	
	public List<Cliente> listarCliente(){
		em = ConnectMySql.getEntityManagerFactory();
		TypedQuery<Cliente> listaCliestes = em.createQuery("From Cliente", Cliente.class);
		return listaCliestes.getResultList();
	}

}
