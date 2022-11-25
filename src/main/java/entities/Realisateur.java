package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

public class Realisateur extends Personne{

	public Realisateur(Long id, String url) {
		super(id, url);
		// TODO Auto-generated constructor stub
	}

	@OneToMany(mappedBy = "realisateur")
	private Set<Naissance> naissances = new HashSet<>();
}
