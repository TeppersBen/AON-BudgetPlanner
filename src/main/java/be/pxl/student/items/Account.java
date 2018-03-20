package be.pxl.student.items;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -6190794198082232099L;
	
	private int id;
	private String number;
	private String IBAN;
	private String name;
	
	public Account() {}

	public Account(int id, String number, String iBAN, String name) {
		super();
		this.id = id;
		this.number = number;
		IBAN = iBAN;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("Account [id=%s, number=%s, IBAN=%s, name=%s]", id, number, IBAN, name);
	}
}