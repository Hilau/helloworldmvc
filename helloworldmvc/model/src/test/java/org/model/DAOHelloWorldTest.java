package org.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {  
	private DAOHelloWorld dao;  

	@Before  
	public void setUp() throws Exception { 
		this.dao = new DAOHelloWorld(); 
	}  

	@Test  public void testGetHelloWorld() {  
		assertEquals(true, this.dao.open());
	}
} 
