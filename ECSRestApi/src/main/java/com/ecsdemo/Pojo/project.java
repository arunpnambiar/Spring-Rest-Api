package com.ecsdemo.Pojo;

public class project {
	
	private int projectId;
	private String projectName;
	private String domain;
	private String language;
	
	public project(int projectId, String projectName, String domain, String language) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.domain = domain;
		this.language = language;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	

}
