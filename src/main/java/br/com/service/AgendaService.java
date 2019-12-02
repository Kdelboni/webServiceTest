package br.com.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.dao.AgendamentoRepository;
import br.com.dao.ClienteDao;
import br.com.model.Agenda;
import br.com.model.Cliente;



public class AgendaService implements Serializable{
	
	@Inject
	private AgendamentoRepository  agendamentoRepository;
	
	public void insert(Agenda agendamento) {
		agendamentoRepository.insert(agendamento);
	}
		
	
	public List<Agenda> listarCliente(){
		return agendamentoRepository.listarCliente();
	}
	

}
