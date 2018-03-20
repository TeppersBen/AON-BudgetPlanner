package be.pxl.student;

import java.sql.SQLException;

import be.pxl.student.dao.AccountDAO;

public class App {
	public static void main(String[] args) {
		try {
			System.out.println(new AccountDAO(Settings.URL, Settings.USER, Settings.PASSWORD).getAccountById(5));
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
