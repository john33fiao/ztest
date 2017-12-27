package com.hb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.hb.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<GuestVo> selectAll() throws Exception {
		String sql = "select * from guest02";
		List<GuestVo> list = new ArrayList<GuestVo>();
		try (Connection conn = dataSource.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new GuestVo(rs.getInt("sabun")
						, rs.getString("name")
						, rs.getTimestamp("nalja")
						, rs.getInt("pay")));
			}
		}
		return list;
	}

	public GuestVo selectOne(int sabun) throws Exception {

		return null;
	}

	public void insertOne(GuestVo bean) throws Exception {
		String sql = "insert into guest02 (name, nalja, pay) values (?,now(),?)";
		try(Connection conn = dataSource.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getPay());
			pstmt.executeUpdate();
		}
	}

	public int updateOne(GuestVo bean) throws Exception {

		return 0;
	}

	public int deleteOne(GuestVo bean) throws Exception {

		return 0;
	}

}
