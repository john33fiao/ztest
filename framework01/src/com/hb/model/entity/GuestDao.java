package com.hb.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.209:1521:xe";
	String id = "scott";
	String pw = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void insertOne(int sabun, String name, String nalja, int pay) {
		String sql = "insert into guest01 (sabun, name, nalja, pay) ";
		sql += "values (?, ?, to_date(?, 'YYYY-MM-DD'), ?) ";
		Object[] objs = { sabun, name, nalja, pay };
		executeUpdate(sql, objs);
	}

	public List<GuestDto> selectAll() {
		String sql = "select * from guest01";

		List<GuestDto> list = executeQuery(sql, new Object[] {});

		return list;
	}

	public GuestDto selectOne(int sabun) {
		String sql = "select * from guest01 where sabun = ?";
		List<GuestDto> list = executeQuery(sql, new Object[] { sabun });
		return list.get(0);
	}

	public void updateOne(int sabun, String name, int pay) {
		String sql = "update guest01 set name = ?, pay = ? where sabun =?";
		executeUpdate(sql, new Object[] { name, pay, sabun });
	}

	public void deleteOne(int sabun) {
		String sql = "delete from guest01 where sabun =?";
		executeUpdate(sql, new Object[] {sabun});
	}

	public GuestDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List executeQuery(String sql, Object[] objs) {
		List<GuestDto> list = new ArrayList<GuestDto>();
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				pstmt.setObject(i + 1, objs[i + 1]);
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				GuestDto bean = new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			allClose();
		}
		return list;
	}

	private void executeUpdate(String sql, Object[] objs) {
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				pstmt.setObject(i, objs[i]);
			}
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			allClose();
		}
	}

	private void allClose() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
