package entities;

import javax.persistence.EntityTransaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJPA {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moviesdatabase");
	EntityManager em = entityManagerFactory.createEntityManager();
	
	EntityTransaction transaction =em.getTransaction();
	transaction.begin();
	transaction.commit();

}
