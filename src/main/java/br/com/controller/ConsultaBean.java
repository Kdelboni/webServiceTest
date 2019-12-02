package br.com.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.model.Agenda;
import br.com.service.AgendaService;

@Named
@ViewScoped
public class ConsultaBean implements Serializable{

	private List<Agenda> listaClienteConsulta;
	

	@Inject
	private AgendaService clienteBo;
	
	
	
	public void init(){
		teste();
	}
	
	
	public List<Agenda> getListaClienteConsulta() {
		return listaClienteConsulta;
	}


	public void setListaClienteConsulta(List<Agenda> listaClienteConsulta) {
		this.listaClienteConsulta = listaClienteConsulta;
	}


	public AgendaService getClienteBo() {
		return clienteBo;
	}


	public void setClienteBo(AgendaService clienteBo) {
		this.clienteBo = clienteBo;
	}


	public ConsultaBean(){
	}
	
	
	@PostConstruct
	public void teste() {
		listaClienteConsulta = clienteBo.listarCliente();
		System.out.println(listaClienteConsulta);
	}
	
}
