package be.pxl.student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.pxl.student.exceptions.PaymentException;
import be.pxl.student.items.Payment;
import be.pxl.student.utils.Database;

public class PaymentDAO extends Database {

	public PaymentDAO(String url, String username, String password) throws SQLException {
		super(url, username, password);
	}

	public Payment getPaymentById(int id) throws PaymentException {
		try {
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM payment WHERE Id=?");
			state.setInt(1, id);
			ResultSet result = state.executeQuery();
			if (result.next()) {
				Payment payment = new Payment(
						id,
						null, //TODO yet to figure out!
						result.getFloat("amount"),
						result.getString("currency"),
						result.getString("detail"),
						result.getInt("accountId"),
						result.getInt("counterAccountId"),
						result.getInt("labelId"));
				return payment;
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new PaymentException(ex);
		}
	}
	
	public List<Payment> getPayments() throws PaymentException {
		try {
			List<Payment> list = new ArrayList<>();
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM payment");
			ResultSet result = state.executeQuery();
			while (result.next()) {
				Payment payment = new Payment(
						result.getInt("id"),
						null, //TODO yet to figure out!
						result.getFloat("amount"),
						result.getString("currency"),
						result.getString("detail"),
						result.getInt("accountId"),
						result.getInt("counterAccountId"),
						result.getInt("labelId"));
				list.add(payment);
			}
			return list;
		} catch (SQLException ex) {
			throw new PaymentException(ex);
		}
	}
}