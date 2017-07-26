package br.com.api.sociotorcedor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.api.sociotorcedor.model.Torcedor;

@Repository
public interface TorcedorRepository extends MongoRepository<Torcedor,String >{
	
	@Query("{ 'email' : { $eq: ?0 } }")
	Torcedor findByEmail(String email);

}
