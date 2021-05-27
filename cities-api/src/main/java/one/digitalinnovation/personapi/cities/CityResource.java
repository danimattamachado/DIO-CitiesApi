package one.digitalinnovation.personapi.cities;



import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("cities")
public class CityResource {

	
	
@Autowired
	  private CityRepository repoCity;

	

@GetMapping
public List<City> cities() {
    return repoCity.findAll();
}
	}

