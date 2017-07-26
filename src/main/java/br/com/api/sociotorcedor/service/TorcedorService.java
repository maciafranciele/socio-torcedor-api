package br.com.api.sociotorcedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.sociotorcedor.exception.EmailJaExisteException;
import br.com.api.sociotorcedor.integration.CampanhaDTO;
import br.com.api.sociotorcedor.model.Torcedor;
import br.com.api.sociotorcedor.repository.TorcedorRepository;

@Service
public class TorcedorService {

	@Autowired
	private TorcedorRepository repository;

	public Torcedor adicionar(Torcedor torcedor) throws EmailJaExisteException{
		if (this.isEmailExistente(torcedor.getEmail())){
			throw new EmailJaExisteException();
		}
		return this.repository.save(torcedor);
	}
	
	public CampanhaDTO buscarPorTime(){
		
		return null;
	}
	
	
	private boolean isEmailExistente(final String email){
		Torcedor torcedor = this.repository.findByEmail(email);
		return torcedor != null ? true : false;
	}


	public List<Torcedor> buscarTodos() {
		return this.repository.findAll();
	}
}
