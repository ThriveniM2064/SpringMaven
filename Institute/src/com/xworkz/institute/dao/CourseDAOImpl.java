package com.xworkz.institute.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.institute.constants.DBConstants;

import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO {

	@Override
	public boolean save(CourseDTO dto) {
		String sqlquery = "INSERT INTO Course_Details Values(?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(DBConstants.URL.getValue(),DBConstants.USERNAME.getValue(), DBConstants.PASSWORD.getValue());
			PreparedStatement statement = connection.prepareStatement(sqlquery);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getDuration());
			statement.setInt(4, dto.getFees());
			statement.setDate(5, Date.valueOf(dto.getStartdate()));
			statement.setBoolean(6, dto.isFree());

			int linesAdded = statement.executeUpdate();
			System.out.println(linesAdded);
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
