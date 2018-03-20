package be.pxl.student.exceptions;

import java.sql.SQLException;

public class AccountException extends SQLException {

	private static final long serialVersionUID = -7691790067062625219L;
	
	public AccountException(Exception ex) {
		super(ex);
	}

}