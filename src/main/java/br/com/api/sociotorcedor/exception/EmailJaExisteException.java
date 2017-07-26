package br.com.api.sociotorcedor.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Cadastro já foi efetuado!")
public class EmailJaExisteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
