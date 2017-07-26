package br.com.api.sociotorcedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.sociotorcedor.exception.EmailJaExisteException;
import br.com.api.sociotorcedor.model.Torcedor;
import br.com.api.sociotorcedor.service.TorcedorService;

@RestController
@RequestMapping("/api/torcedor")
public class SocioTorcedorController {
	
	@Autowired
	private TorcedorService service;
	
	@Cacheable(value = "torcedores")
	@RequestMapping(method = RequestMethod.GET, produces =  {MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody List<Torcedor> listaTorcedores(){
		return service.buscarTodos();
	}
	

	@CacheEvict(allEntries = true, value = "torcedores", beforeInvocation = false)
	@RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
	public Torcedor salvar(@RequestBody Torcedor torcedor) throws EmailJaExisteException{
		return service.adicionar(torcedor);
		
	}
}
