package cz.uhk.ppro.jpacviceni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cz.uhk.ppro.jpacviceni.entity.Project;
import cz.uhk.ppro.jpacviceni.entity.ResearchProject;
import cz.uhk.ppro.jpacviceni.entity.Student;
import cz.uhk.ppro.jpacviceni.entity.University;

public class DbInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create the EntityManagerFactory & EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cviceni");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// TODO vytvorit instance, provazat vztahy, zpersistnet pomoci em.persist(o);
		
		University uni = new University();
		uni.setName("UHK4");
		ResearchProject projekt1 = new ResearchProject();
		projekt1.setName("Projektik4");
		projekt1.setResearchObjectives("Vyzkum mimozemstanu");
		ResearchProject projekt2 = new ResearchProject();
		projekt2.setName("Druhy projekt4");
		projekt1.setResearchObjectives("Zaradit Pluto zpet mezi planety");
		Student student1 = new Student();
		student1.setFirstname("Prvni");
		student1.setSurname("Studentik4");
		student1.setUniversity(uni);
		List<Project> proj = new ArrayList<Project>();
		proj.add(projekt1);
		proj.add(projekt2);
		student1.setProjects(proj);
		
		Student student2 = new Student();
		student2.setFirstname("Druhy");
		student2.setSurname("Studentik4");
		student2.setUniversity(uni);
		student2.setProjects(proj);

		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		uni.setStudents(students);
		projekt1.setStudents(students);
		projekt2.setStudents(students);
		
		em.persist(uni);
		em.persist(projekt1);
		em.persist(projekt2);
		em.persist(student1);
		em.persist(student2);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
