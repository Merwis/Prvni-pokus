package cz.uhk.ppro.jpacviceni.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ResearchProject
 *
 */
@Entity

public class ResearchProject extends Project implements Serializable {

	private String researchObjectives;
	
	public String getResearchObjectives() {
		return researchObjectives;
	}

	public void setResearchObjectives(String researchObjectives) {
		this.researchObjectives = researchObjectives;
	}

	public ResearchProject(String researchObjectives) {
		super();
		this.researchObjectives = researchObjectives;
	}

	private static final long serialVersionUID = 1L;

	public ResearchProject() {
		super();
	}
   
}
