package be.pxl.student.exceptions;

import java.sql.SQLException;

public class PaymentException extends SQLException {

	private static final long serialVersionUID = -2330573010811014039L;

	public PaymentException(Exception ex) {
		super(ex);
	}
	
}
