package com.company.dao.pojo;
/**
 * 
 * @author Administrator
 * Product��Ӧt_product��
 */
public class Product {
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;//��Ʒ����
	private String ean;//��Ʒ���
	private double price;//��Ʒ�۸�

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, String ean, double price) {
		super();
		this.pname = pname;
		this.ean = ean;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ean=" + ean + ", price=" + price + "]";
	}


}