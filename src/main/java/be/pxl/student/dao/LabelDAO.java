package be.pxl.student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.pxl.student.exceptions.LabelException;
import be.pxl.student.items.Label;
import be.pxl.student.utils.Database;

public class LabelDAO extends Database {

	public LabelDAO(String url, String username, String password) throws SQLException {
		super(url, username, password);
	}

	public Label getLabelById(int id) throws LabelException {
		try {
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM label WHERE Id=?");
			state.setInt(1, id);
			ResultSet result = state.executeQuery();
			if (result.next()) {
				Label label = new Label(
						id,
						result.getString("name"),
						result.getString("description"));
				return label;
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new LabelException(ex);
		}
	}
	
	public List<Label> getLabels() throws LabelException {
		try {
			List<Label> list = new ArrayList<>();
			PreparedStatement state = getConnection().prepareStatement("SELECT * FROM Label");
			ResultSet result = state.executeQuery();
			while (result.next()) {
				Label label = new Label(
						result.getInt("id"),
						result.getString("name"),
						result.getString("description"));
				list.add(label);
			}
			return list;
		} catch (SQLException ex) {
			throw new LabelException(ex);
		}
	}
}