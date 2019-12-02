package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agenda")
public class Agenda implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Integer id;
	
	@Column(name = "exame")
    private String exame;

	@Column(name = "convenio")
    private String convenio;
	
	@Column(name = "medico")
    private String medico;
	
	@Column(name = "dataExame")
    private String dataExame;
	
	@Column(name = "statusExame")
    private String status;
	
	@Column(name = "nomeCliente")
    private String nomeCliente;
 
	
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getExame() {
		return exame;
	}



	public void setExame(String exame) {
		this.exame = exame;
	}



	public String getConvenio() {
		return convenio;
	}



	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}



	public String getMedico() {
		return medico;
	}



	public void setMedico(String medico) {
		this.medico = medico;
	}



	public String getData() {
		return dataExame;
	}



	public void setData(String data) {
		this.dataExame = data;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getDataExame() {
		return dataExame;
	}



	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
    
	

    
    

}
