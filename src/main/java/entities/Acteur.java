package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "ACTEUR")
public class Acteur extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="id_imbd")
	private String height;
	
	

	public Acteur(Long id, String height) {
		super(id, height);
		this.id = id;
		this.height = height;
	}
	@OneToMany(mappedBy = "acteur")
	private Set<Role> roles = new HashSet<>();
	
	@OneToMany(mappedBy = "acteur")
	private Set<Personne> personnes = new HashSet<>();
	
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
