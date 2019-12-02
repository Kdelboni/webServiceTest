package br.com.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.model.Agenda;
import br.com.model.Cliente;


public class AgendamentoRepository {

	private EntityManager em;

	public void insert(Agenda agendamento) {
		try {
			em = ConnectMySql.getEntityManagerFactory();
			em.getTransaction().begin();
			em.persist(agendamento);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
	}
	public List<Agenda> listarCliente(){
		em = ConnectMySql.getEntityManagerFactory();
		TypedQuery<Agenda> listaClientes = em.createQuery("From Agenda", Agenda.class);
		return listaClientes.getResultList();
	}

	
}
