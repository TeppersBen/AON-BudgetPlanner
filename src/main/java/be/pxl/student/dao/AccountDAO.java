package be.pxl.student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.pxl.student.exceptions.AccountException;
import be.pxl.student.items.Account;
import be.pxl.student.utils.Database;

public class AccountDAO extends Database {

	public AccountDAO(String url, String username, String password) throws SQLException {
		super(url, username, password);
	}
	
	public Account getAccountById(int id) throws AccountException {
		try {
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM Account WHERE Id=?");
			state.setInt(1, id);
			ResultSet result = state.executeQuery();
			if (result.next()) {
				Account account = new Account(
						id,
						result.getString("number"),
						result.getString("IBAN"),
						result.getString("name"));
				return account;
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new AccountException(ex);
		}
	}

	public List<Account> getAccounts() throws AccountException {
		try {
			List<Account> list = new ArrayList<Account>();
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM Account");
			ResultSet result = state.executeQuery();
			while (result.next()) {
				Account account = new Account(
						result.getInt("id"),
						result.getString("number"),
						result.getString("IBAN"),
						result.getString("name"));
				list.add(account);
			}
			return list;
		} catch (SQLException ex) {
			throw new AccountException(ex);
		}
	}

}