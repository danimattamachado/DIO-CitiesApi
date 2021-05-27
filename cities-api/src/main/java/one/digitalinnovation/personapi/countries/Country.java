package one.digitalinnovation.personapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Country")
@Table(name = "pais")
@Data


public class Country {

		  @Id
	  private Long id;

	  @Column(name = "nome")
	  private String name;

	  @Column(name = "nome_pt")
	  private String portugueseName;

	  @Column(name = "sigla")
	  private String code;

	  private Integer bacen;

	  	  
	}
	
	
	
	
	
	

