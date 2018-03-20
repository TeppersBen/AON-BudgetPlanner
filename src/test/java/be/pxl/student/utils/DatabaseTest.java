package be.pxl.student.utils;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import be.pxl.student.Settings;
import be.pxl.student.utils.Database;

public class DatabaseTest {

	private Database database;
	
	@Before
	public void setup() throws SQLException {
		database = new Database(Settings.URL, Settings.USER, Settings.PASSWORD);
	}
	
	@Test
	public void create_connection_to_database() throws SQLException {
		new Database(Settings.URL, Settings.USER, Settings.PASSWORD);
	}

	@Test
	public void close_database_connection() throws SQLException {
		database.closeConnection();
	}
	
	@Test
	public void test_function_executeQuery() throws SQLException {
		
	}
}