package com.scp;

import java.util.ArrayList;
import java.util.List;

public class Products {
	private int pid;
	private String pName;
	static private String vendor;
	static List<Products> listOfProducts = new ArrayList();
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public static String getVendor() {
		return vendor;
	}
	public static void setVendor(String vendor) {
		Products.vendor = vendor;
	}
	
	public Products() {
		super();
		Products p1 = new Products("P1",101);
		Products p2 = new Products("P2",102);
		Products p3 = new Products("P3",103);
		Products p4 = new Products("P4",104);
		Products p5 = new Products("P5",105);
		Products p6 = new Products("P6",106);
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
		listOfProducts.add(p4);
		listOfProducts.add(p5);
		listOfProducts.add(p6);
	}
		
	
	
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pName=" + pName + "]";
	}
	public Products searchInInvetoryById(int pid) throws ProductWithGivenNameOrIdNotFound, InvalidProductName{
		boolean isProductFound=false;
		if(0==pid){
			throw new InvalidProductName("0-Neat enter kar re");
		}
		
		
		for (Products product : listOfProducts) {
			if(product.getPid()==pid)
				return product;
		}
		

		if(!isProductFound)
			throw new ProductWithGivenNameOrIdNotFound("0-Tumcha product nahiye dusarikde try kara..!");
		
		return null;
	}
		
	
	public Products searchInInvetoryByName(String pname) throws InvalidProductName, ProductWithGivenNameOrIdNotFound{
		boolean isProductFound=false;
		if(null==pname || "".equals(pname) || pname.length()<=1){
			throw new InvalidProductName("Neat enter kar re");
		}
		
		for (Products product : listOfProducts) {
			if(pname.equals(product.getpName()))
				isProductFound=true;
				return product;
		}
		
		if(!isProductFound)
			throw new ProductWithGivenNameOrIdNotFound("Tumcha product nahiye dusarikde try kara..!");
		
		return null;
	}
	public Products(String pnm, int i) {
		this.pid=i;
		this.pName=pnm;
	}
	
}
