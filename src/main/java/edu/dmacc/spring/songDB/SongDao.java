package edu.dmacc.spring.songDB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class SongDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SongDB");

	public void insertUser(Song songToAdd){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SongDB");

		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(songToAdd);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
	
	public List<Song> getAllUsers(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SongDB");

		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Song u";
		TypedQuery<Song> typedQuery = em.createQuery(q, Song.class);
		List<Song> all = typedQuery.getResultList();
		return all;
	}
}
