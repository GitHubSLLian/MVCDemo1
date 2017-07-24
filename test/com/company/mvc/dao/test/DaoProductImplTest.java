package com.company.mvc.dao.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;

public class DaoProductImplTest {
	private IProductDao productDao;
	@Before
	public void setUp() throws Exception {
			productDao = DaoFactory.getProductInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() throws Exception {
		Product p1 = new Product("aaaa","soo1",23.00);
		Product p2 = new Product("bbbb","soo2",33.00);
		Product p3 = new Product("cccc","soo3",43.00);
		Product p4 = new Product("dddd","soo4",53.00);
		productDao.save(p1);
		productDao.save(p2);
		productDao.save(p3);
		productDao.save(p4);
		
		
	}

	@Test
	public void testUpdate() throws Exception {
		Product p = new Product();
		p.setPid(25);
		p.setPname("LiuLian");
		p.setEan("w001");
		p.setPrice(100.00);
		productDao.update(p);
		
	}

	@Test
	public void testDelete() throws Exception {
		Product p = new Product();
		p.setPid(25);
		productDao.delete(p);
		System.out.println("delete success!");
	}

	@Test
	public void testFindAll() throws Exception {
		List<Product> productList = productDao.findAll();
		for(Product p : productList){
			System.out.println(p);
			
		}
	}

	@Test
	public void testFindById() throws Exception {
		System.out.println(productDao.findById(26));
	
	}

	@Test
	public void testFindByName() throws Exception {
		List<Product> productList = productDao.findByName("b");
		for(Product p : productList){
			System.out.println(p);
			
		}
	}

	@Test
	public void testFindByPage() throws Exception {
		List<Product> productList = productDao.findByPage(2,4);
		for(Product p : productList){
			System.out.println(p);
		
	}
	}
}
