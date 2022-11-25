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
@Table(name="PAYS")
public class Pays {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="id_imdb")
	private String nom;
	
	private String url;
	
	@OneToMany(mappedBy = "pays")
	private Set<Film> films = new HashSet<>();

	@OneToMany(mappedBy = "pays")
	private Set<LieuTournage> lieuTournages = new HashSet<>();
	
	public Pays(Long id, String nom, String url) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
