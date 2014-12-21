package cz.uhk.ppro.jpacviceni.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String firstname;
	private String surname;
	private int rocnik;
	

	@ManyToOne
	private University university;
	@ManyToMany
	private List<Project> projects;
	
	
	
	public Student() {
	}

	public Student(String firstname, String surname, University university,
			List<Project> projects) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.university = university;
		this.projects = projects;
	}

	public Student(String firstname, String surname, int rocnik,
			University university, List<Project> projects) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.rocnik = rocnik;
		this.university = university;
		this.projects = projects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public int getRocnik() {
		return rocnik;
	}

	public void setRocnik(int rocnik) {
		this.rocnik = rocnik;
	}

	private static final long serialVersionUID = 1L;
   
}
