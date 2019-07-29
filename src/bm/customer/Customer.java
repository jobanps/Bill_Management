package bm.customer;

public class Customer implements IDisplay {

	private String customerId;
	private String custFirstName;
	private String custLastName;
	private String custFullName;
	private String custEmailId;
	private double totalPayableAmount;
	
	//Customer Class Constructor
	public Customer() {
		// Code Goes here
	}
	
	// Method will display all types of Monthly Bills for Customer
	@Override
	public void display() {
		
		// Code Here
		
		
	}

	//Getters and Setters
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustFullName() {
		return custFullName;
	}

	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}

	public double getTotalPayableAmount() {
		return totalPayableAmount;
	}

	public void setTotalPayableAmount(double totalPayableAmount) {
		this.totalPayableAmount = totalPayableAmount;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

}
