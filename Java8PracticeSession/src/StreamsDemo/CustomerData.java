package StreamsDemo;

import java.util.List;

public class CustomerData {
	
	int customerId;
	String customerName;
	String customerEmail;
	List<String> mobileNumber;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public List<String> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<String> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public CustomerData(int customerId, String customerName, String customerEmail, List<String> mobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
