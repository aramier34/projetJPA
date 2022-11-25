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
@Table(name= "FILM")
public class Film {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
	private Long id;

@Column(name="imbd_href")
	private String nom;
	private String url; 
	private String plot;
	private String langue;
	private String anneeSortie;
	
	
	
	public Film(Long id, String nom, String url, String plot, String langue, String anneeSortie) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.anneeSortie = anneeSortie;
	}
	
	@OneToMany(mappedBy = "film")
	private Set<Genre> genres = new HashSet<>();
	
	@OneToMany(mappedBy = "film")
	private Set<Pays> pays = new HashSet<>();
	
	@OneToMany(mappedBy = "film")
	private Set<LieuTournage> lieuTournages = new HashSet<>();
	
	@OneToMany(mappedBy = "film")
	private Set<Role> roles = new HashSet<>();
	
	@OneToMany(mappedBy = "film")
	private Set<Personne> personnes = new HashSet<>();
	
	@OneToMany(mappedBy = "film")
	private Set<Langue> langues = new HashSet<>();
	
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
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	
	

}
