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
@Table(name="PERSONNE")
public class Personne {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="id_imdb")
private String url;

	@OneToMany(mappedBy = "personne")
	private Set<Film> films = new HashSet<>();

public Personne(Long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}



}
