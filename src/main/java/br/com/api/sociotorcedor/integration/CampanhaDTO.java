package br.com.api.sociotorcedor.integration;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.api.sociotorcedor.model.TimeDoCoracao;


public class CampanhaDTO {

	private String id;
	
	private String nomeCampanha;
	
	private LocalDate dataInicio;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataFim;
	
	private TimeDoCoracao idTimeCoracao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeCampanha() {
		return nomeCampanha;
	}

	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	
	
	public TimeDoCoracao getIdTimeCoracao() {
		return idTimeCoracao;
	}

	public void setIdTimeCoracao(TimeDoCoracao idTimeCoracao) {
		this.idTimeCoracao = idTimeCoracao;
	}


}
