package one.digitalinnovation.personapi.staties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/staties")
public class StateResource {

		@Autowired
		  private StateRepository repoState;

	 

	  @GetMapping
	  public List<State> staties() {
	    return repoState.findAll();
	  }
	}

