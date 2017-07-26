package br.com.api.sociotorcedor.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "torcedores")
public class Torcedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Field("nome_completo")
	private String nomeCompleto;
	
	@Field("email")
	private String email;
	
	@Field("data_nascimento")
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataNascimento;
	
	@DBRef(db="_id")
	@Field("time_coracao")
	private TimeDoCoracao timeDoCoracao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public TimeDoCoracao getTimeDoCoracao() {
		return timeDoCoracao;
	}

	public void setTimeDoCoracao(TimeDoCoracao timeDoCoracao) {
		this.timeDoCoracao = timeDoCoracao;
	}
	
	

}
