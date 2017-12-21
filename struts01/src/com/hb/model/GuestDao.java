package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hb.model.entity.GuestVo;

public class GuestDao {

	private String driver = "org.gjt.mm.mysql.Driver";
	private String url = "jdbc:mysql://localhost:3306/xe";
	private String user = "scott";
	private String password = "tiger";

	public List<GuestVo> selectAll() throws Exception {
		List<GuestVo> list = new ArrayList<GuestVo>();

		Class.forName(driver);
		try (Connection conn = DriverManager.getConnection(url, user, password);
		// 자동으로 close 해주는 목적
		// 자바 7 버전에서 생긴 문법
		// null로 선언해서 제어하려고 하면 에러 날 것임
		// 버전에 의해 영향 받으므로 만능은 아니다
		) {
			PreparedStatement pstmt = conn.prepareStatement("select * from guest01");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				GuestVo bean = new GuestVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}

		} finally {

		}

		return list;
	}

	public void addOne(String name, int pay) throws Exception {
		String sql = "insert into guest01 (name, nalja, pay) ";
		sql+= "values (?, now(), ?)";
		Class.forName(driver);
		try (
				Connection conn = DriverManager.getConnection(url, user, password)
				){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			pstmt.executeUpdate();
		} finally {
			
		}
		
		
	}

	public GuestVo selectOne(int sabun) throws Exception {
		String sql = "select * from guest01 where sabun=?";
		GuestVo bean = new GuestVo();
		Class.forName(driver);
		try (
				Connection conn = DriverManager.getConnection(url, user, password)
				){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
			}
		} finally {
			
		}
		
		return bean;
	}
}
