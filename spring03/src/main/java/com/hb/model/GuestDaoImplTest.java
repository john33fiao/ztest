package com.hb.model;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hb.model.entity.GuestVo;

public class GuestDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/xe");
		datasource.setUsername("scott");
		datasource.setPassword("tiger");
		
		dao =  new GuestDaoImpl();
		dao.setDataSource(datasource);
		List<GuestVo> list = dao.selectAll();
		Assert.assertNotNull(list);
		assertTrue(list.size()>0);
		fail("Not yet implemented");
	}

	@After
	public void tearDown() throws Exception {
	}

	private GuestDaoImpl dao;
	
	@Test
	public void testSelectAll() throws Exception {
		
	}

	@Test
	public void testInsertOne() {
		fail("Not yet implemented");
	}

}
