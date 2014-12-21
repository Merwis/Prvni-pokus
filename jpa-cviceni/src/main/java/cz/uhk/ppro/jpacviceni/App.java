package cz.uhk.ppro.jpacviceni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cz.uhk.ppro.jpacviceni.entity.University;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create the EntityManagerFactory & EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cviceni");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		String query = "SELECT u FROM University u";
		List<University> uni = em.createQuery(query).getResultList();
		
		for (int i = 0; i < uni.size(); i++) {
			System.out.println(uni.get(i).getName());
			for (int j = 0; j < uni.get(i).getStudents().size(); j++) {
				System.out.println(uni.get(i).getStudents().get(j).getSurname());
			}
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
