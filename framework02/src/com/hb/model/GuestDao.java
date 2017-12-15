package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hb.model.entity.GuestVo;

// 디자인패턴이 적용된 DAO
public class GuestDao {

	public List<GuestVo> selectAll() throws Exception {
		String sql = "select * from guest01";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		List<GuestVo> list = new ArrayList<GuestVo>();
		Connection conn = DriverManager.getConnection("String url = \"jdbc:oracle:thin:@203.236.209.209:1521:xe", "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			list.add(new GuestVo(
					rs.getInt("sabun"),
					rs.getString("name"),
					rs.getDate("nalja"),
					rs.getInt("pay")
					));
		}
		return list;
	}
	
}
