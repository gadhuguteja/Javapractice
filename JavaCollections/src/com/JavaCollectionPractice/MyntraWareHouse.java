package com.JavaCollectionPractice;

public class MyntraWareHouse {
	
	private int productId;
	private String productName;
	private String manufacteringCompany;
	
	public MyntraWareHouse(int productId, String productName, String manufacteringCompany) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.manufacteringCompany = manufacteringCompany;
	}

	

	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getManufacteringCompany() {
		return manufacteringCompany;
	}



	public void setManufacteringCompany(String manufacteringCompany) {
		this.manufacteringCompany = manufacteringCompany;
	}



	@Override
	public String toString() {
		return "MyntraWareHouse [productId=" + productId + ", productName=" + productName + ", manufacteringCompany="
				+ manufacteringCompany + "]";
	}
	
}
