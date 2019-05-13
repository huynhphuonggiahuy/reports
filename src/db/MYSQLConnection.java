package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Student;

public class MYSQLConnection {
	
	public static final String USER = "userlogin";
	public static final String PASS = "Userlogin123";
	
	public Connection getConn(String url) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Student> loadAllStudent() throws SQLException {

		List<Student> outputs = new ArrayList<Student>();
		Connection conn = getConn("jdbc:mysql://13.92.197.43:3306/DATAMART");
		String sqlSelectAllStudent = "SELECT * FROM export";
		PreparedStatement ps = conn.prepareStatement(sqlSelectAllStudent);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Student st = new Student();
			
			outputs.add(st);
		}
		close(conn);
		return outputs;
	}
}
