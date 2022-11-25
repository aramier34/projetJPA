package entities;

import java.util.Date;
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
@Table(name="NAISSANCE")
public class Naissance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="id_imdb")
	private String lieuNaissance;
	private Date dateNaissance;
	
	@OneToMany(mappedBy = "naissance")
	private Set<Acteur> acteurs = new HashSet<>();
	
	@OneToMany(mappedBy = "naissance")
	private Set<Realisateur> realisateurs = new HashSet<>();
	
	public Naissance(Long id, String lieuNaissance, Date dateNaissance) {
		super();
		this.id = id;
		this.lieuNaissance = lieuNaissance;
		this.dateNaissance = dateNaissance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
