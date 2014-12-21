package cz.uhk.ppro.jpacviceni.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Entity implementation class for Entity: University
 *
 */
@Entity

public class University implements Serializable {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy = "university")
	private List<Student> students;


	public University() {
	}
	
	public University(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private static final long serialVersionUID = 1L;

   
}
