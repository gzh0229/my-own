package chapter20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

/*
 * executeUpdate()方法是在 PreparedStatement对象中执行 SQL语句，该语句必须是一个 DML数据操作语句，如 INSERT、UPDATE、DELETE，或 DDL数据定义语言
 */
public class TestJDBC01 {

	@Test
	public void test01() {
		TestConnection tc = new TestConnection();
		try {
			Connection conn = tc.getConnection();
			if (conn != null) {
				System.out.println("获取连接成功。。。");
			}
			Statement stmt = conn.createStatement();
			// 顺序查询
			String sql = "SELECT * FROM users";
			// 模糊查询
			// String sql = "SELECT * FROM users WHERE NickName LIKE '%m'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("NickName") + "\t" + rs.getString("RealName")
						+ "\t" + rs.getInt("Age") + "\t" + rs.getDate("RegTime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 预处理语句
	 */
	@Test
	public void test02() {
		TestConnection tc = new TestConnection();
		try {
			Connection conn = tc.getConnection();
			String sql = "SELECT * FROM users WHERE Id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 3);// 1表示第一个通配符，3表示参数的值
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("NickName") + "\t" + rs.getString("RealName")
						+ "\t" + rs.getInt("Age") + "\t" + rs.getDate("RegTime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 增加
	 */
	@Test
	public void test03() {
		TestConnection tc = new TestConnection();
		try {
			Connection conn = tc.getConnection();
			PreparedStatement pstmt;
			String sql;
			sql = "INSERT INTO users(NickName, RealName, Age) VALUES (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "aa");
			pstmt.setString(2, "啊啊");
			pstmt.setInt(3, 11);
			if (pstmt.executeUpdate() == 1) {
				System.out.println("添加成功");
			}
			sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("NickName") + "\t" + rs.getString("RealName")
						+ "\t" + rs.getInt("Age") + "\t" + rs.getDate("RegTime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 修改
	 */
	@Test
	public void test04() {
		TestConnection tc = new TestConnection();
		try {
			Connection conn = tc.getConnection();
			PreparedStatement pstmt;
			String sql;
			sql = "UPDATE users SET NickName='bb' WHERE Id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "12");
			if (pstmt.executeUpdate() == 1) {
				System.out.println("修改成功");
			}
			sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("NickName") + "\t" + rs.getString("RealName")
						+ "\t" + rs.getInt("Age") + "\t" + rs.getDate("RegTime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 删除
	 */
	@Test
	public void test05() {
		TestConnection tc = new TestConnection();
		try {
			Connection conn = tc.getConnection();
			PreparedStatement pstmt;
			String sql;
			// sql = "DELETE FROM users WHERE Id=?";
			sql = "DELETE FROM users WHERE Id>?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 8);
			if (pstmt.executeUpdate() == 1) {
				System.out.println("删除成功");
			}
			sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("NickName") + "\t" + rs.getString("RealName")
						+ "\t" + rs.getInt("Age") + "\t" + rs.getDate("RegTime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
