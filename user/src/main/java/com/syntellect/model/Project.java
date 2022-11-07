package com.syntellect.model;
import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.el.parser.AstFalse;
import org.hibernate.type.TrueFalseType;

@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="project_id",nullable=false)
	private int projectId;
	
	
	@Column (name="project_name")
	private String projectName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private int userId;
	
	private User user;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getprojectName() {
		return projectName;
	}

	public void setprojectName(String projectName) {
		this.projectName = projectName;
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}
	
	public Project(int projectId, String projectName,int userId) {
		this.projectId=projectId;
		this.projectName=projectName;
		this.userId=userId;
	}

	
	
	
	
	
}
