package bm.customer;

import java.util.ArrayList;

import bm.bills.Bill;

public class Customer implements IDisplay {

	private String customerId;
	private String custFirstName;
	private String custLastName;
	private String custFullName;
	private String custEmailId;
	private double totalPayableAmount;
	private ArrayList<Bill> billList;

	// Customer Class Constructor
	public Customer(String _customerId, String _custFirstName, String _custLastName, String _custEmailId) {

		this.customerId = _customerId;
		this.custFirstName = _custFirstName;
		this.custLastName = _custLastName;
		this.custFullName = _custFirstName + " " + _custLastName;
		this.custEmailId = _custEmailId;
		billList = new ArrayList<Bill>();
	}

	// Method will display all types of Monthly Bills for Customer
	@Override
	public void display() {


		if(this.billList.size() > 0) {
			System.out.println("\t---- Bill Information ----");
			for (Bill bill : billList) {
				System.out.println("******************************************************");
				System.out.println(bill.billDetailsToString());		
				
			}
			System.out.println("******************************************************");
			System.out.println("Total Bill Amount to Pay :$" + this.calcTotalAmount());
			System.out.println("******************************************************");
		} else {
			System.out.println("~~~NOTE : This Customer has no bills");
		}
	}

	// Adding new Bill to Customer Account
	public void addBill(Bill bill) {
		this.billList.add(bill);
	}

	// Calculate Total Amount
	public double calcTotalAmount() {

		double totalAmount = 0;
		for (Bill bill : billList) {

			totalAmount += bill.getTotalBillAmount();
		}
		return totalAmount;
	}

	// Getters and Setters
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
