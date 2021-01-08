package com.myproject.ppmtool.Exception;

public class ProjectIdExceptionResponse {

	private String projectIdentifier;
	
	public ProjectIdExceptionResponse(String projectIdentifier) {
		this.setProjectIdentifier(projectIdentifier);
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
}
