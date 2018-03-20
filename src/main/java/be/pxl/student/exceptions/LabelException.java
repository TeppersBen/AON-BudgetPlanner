package be.pxl.student.exceptions;

import java.sql.SQLException;

public class LabelException extends SQLException {

	private static final long serialVersionUID = 8301164152068775193L;

	public LabelException(Exception ex) {
		super(ex);
	}
	
}