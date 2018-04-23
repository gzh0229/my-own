package com.java.testng.test;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	@Test
	@Parameters({ "dbconfig", "poolsize" })
	public void dbTest(String dbconfig, int poolsize) {
		System.out.println("dbcofig:" + dbconfig);
		System.out.println("poolsize" + poolsize);

		Properties p = new Properties();
		InputStream input = null;

		String path = System.getProperty("user.dir") + "\\" + dbconfig;
		try {
			p.load(new FileInputStream(dbconfig));

			String driver = p.getProperty("jdbc.driver");
			String url = p.getProperty("jdbc.url");
			String user = p.getProperty("jdbc.user");
			String password = p.getProperty("jdbc.password");

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);

			assertEquals(conn != null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
