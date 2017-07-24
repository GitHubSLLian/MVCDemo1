package com.company.mvc.dao.test;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.util.SessionFactory;

public class SessionFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSession() throws Exception {
		System.out.println("Á¬½Ó£º"+SessionFactory.getInstance().getSession().toString());
		
		
	}

}
