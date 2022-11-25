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
@Table(name = "LIEUTOURNAGE")
public class LieuTournage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="id_imdb")
	private String ville;
	
	private String etatDept;

	@OneToMany(mappedBy = "lieuTournage")
	private Set<Film> films = new HashSet<>();
	
	@OneToMany(mappedBy = "lieuTournage")
	private Set<Pays> pays = new HashSet<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEtatDept() {
		return etatDept;
	}

	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	public LieuTournage(Long id, String ville, String etatDept) {
		super();
		this.id = id;
		this.ville = ville;
		this.etatDept = etatDept;
	}
	
	

	
}
