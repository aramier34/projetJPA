package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="id_imdb")
	private String characterName;

	@OneToMany(mappedBy = "role")
	private Set<Film> films = new HashSet<>();
	
	@OneToMany(mappedBy = "role")
	private Set<Acteur> acteurs = new HashSet<>();
	
	public Role(Long id, String characterName) {
		super();
		this.id = id;
		this.characterName = characterName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	

}
