package be.pxl.student.items;

import java.io.Serializable;

public class Label implements Serializable {

	private static final long serialVersionUID = 8754691896091712295L;
	
	private int id;
	private String name;
	private String description;
	
	public Label() {}

	public Label(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return String.format("Label [id=%s, name=%s, description=%s", id, name, description);
	}
}