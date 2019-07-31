package bm.customer;

import java.util.ArrayList;

import bm.bills.Bill;

public class Customer implements IDisplay {

	private int customerId;
	private String custFirstName;
	private String custLastName;
	private String custFullName;
	private String custEmailId;
	private double totalPayableAmount;
	private ArrayList<Bill> billList;

	// Customer Class Constructor
	public Customer(int customerId, String custFirstName, String custLastName, String custEmailId) {

		this.customerId = customerId;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custFullName = custFirstName + " " + custLastName;
		this.custEmailId = custEmailId;
		billList = new ArrayList<Bill>();
	}

	// Method will display all types of Monthly Bills for Customer
	@Override
	public void display() {

		if (this.billList.size() > 0) {
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
	public void addBill(Bill bill) throws Exception {
	
		int key = bill.getBillId();
		int listSize = this.billList.size();
		
		if (listSize > 0 && this.billList.get(listSize-1).getBillId() > key) {

			for (int i = 0; i < listSize; i++) {

				if (key < this.billList.get(i).getBillId()) {

					
					this.billList.add(this.billList.get(listSize - 1));

					for (int j = listSize - 1; j > i; j--) 
						this.billList.set(j, this.billList.get(j - 1)); //move all customers by 1 place to right

					this.billList.set(i, bill); // add new customer to list at sorted position
					break;
					
				} else if (key == this.billList.get(i).getBillId()) {
					throw new Exception("Bill with same id already exist.");
				}
			}

		} else {
			
			this.billList.add(bill);
			System.out.println("New Bill Added");
		}
	    
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
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
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
