package com.company.mvc.service.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.pojo.Product;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IProductService;

public class ServiceProductImplTest {
	IProductService productService;

	@Before
	public void setUp() throws Exception {
		productService = ServiceFactory.getProductInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		Product p = new Product("ab","s2",123.00);
		p.setPid(31);
		String msg = productService.save(p);
		System.out.println("success".equals(msg)?"save success!":"save error!");
		
	}

	@Test
	public void testUpdate() {
		Product p = new Product();
		p.setPid(26);
		p.setPname("SSS");
		p.setEan("sss");
		p.setPrice(120.00);
		System.out.println(productService.update(p));
		
		
	}

	@Test
	public void testDelete() {
		Product p = new Product();
		p.setPid(26);
		p.setPname("SSS");
		p.setEan("sss");
		p.setPrice(120.00);
		System.out.println(productService.delete(p));
	}

	@Test
	public void testFindAll() {
		List<Product> productList = productService.findAll();
		for(Product p : productList){
			System.out.println(p);
			
		}
	}

	@Test
	public void testFindById() {
		System.out.println(productService.findById(36));
	}

	@Test
	public void testFindByName() {
		List<Product> productList = productService.findByName("F");
		for(Product p : productList){
			System.out.println(p);
			
		}
	}

	@Test
	public void testFindByPage() {
		List<Product> productList = productService.findByPage(2,4);
		for(Product p : productList){
			System.out.println(p);
	}
	}
}
