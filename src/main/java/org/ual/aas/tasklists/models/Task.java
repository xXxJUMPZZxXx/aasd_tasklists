package org.ual.aas.tasklists.models;

public class Task {
	private int id;
	private String description;
	private String status; // doing, done
	
	public Task() {
	}

	public Task(String description, String status) {
		this.description = description;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
