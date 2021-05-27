package one.digitalinnovation.personapi.countries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counties")
public class CountryResource {

	@Autowired	
	  private CountryRepository repoCountry;

	
//Retornar lista de Paises
	  @GetMapping("/countries")
	  public List<Country> cities() {

	    return repoCountry.findAll();
	  }
	  
	  
	  //Retornar um Pais pelo id
	  
	  @GetMapping("/{id}")
	  public ResponseEntity getOne(@PathVariable Long id) {
		  
		  Optional<Country> optional = repoCountry.findById(id);
		  
		  if(optional.isPresent()) {
		  return ResponseEntity.ok().body(optional.get());
	  } else {
		  
		  return ResponseEntity.notFound().build();
	  }
	  
	}
	
	
}
