package com.ecsdemo.Pojo;

public class client {
	private int clientid;
	private String clientname;
	private String projectName;
	
	public client(int clientid, String clientname, String projectName) {
		super();
		this.clientid = clientid;
		this.clientname = clientname;
		this.projectName = projectName;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
