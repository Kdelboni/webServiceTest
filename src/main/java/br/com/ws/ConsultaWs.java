package br.com.ws;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import org.primefaces.json.JSONObject;

import br.com.model.Agenda;
import br.com.model.Cliente;
import br.com.service.AgendaService;

@Path("/consulta")
public class ConsultaWs implements Serializable {

	@Inject
	private AgendaService agendamentoService;
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/agenda")
	public Agenda getTestService(String json) {
		JSONObject jsonObject = new JSONObject(json);
		Agenda agendamento = new Agenda();
		System.out.println("chegou: " + json);
		
		
		
		agendamento.setConvenio(jsonObject.getString("convenio_agenda"));
		agendamento.setExame(jsonObject.getString("exame_agenda"));
		agendamento.setMedico(jsonObject.getString("medico_agenda"));
		agendamento.setData(jsonObject.getString("data_agenda"));
		agendamento.setStatus("P");
		agendamento.setNomeCliente(jsonObject.getString("nome_cliente"));
		
		
		agendamentoService.insert(agendamento);
		
		return agendamento;
	}
	
	
	

	

}
