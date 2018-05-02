package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	Connection conn;

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test_20170205";
		conn = DriverManager.getConnection(url, "root", "root");
		return conn;
	}

}
