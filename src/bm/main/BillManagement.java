package bm.main;

import java.util.ArrayList;

import bm.customer.Customer;
import bm.customer.IDisplay;

public class BillManagement implements IDisplay {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public void addCustomers(Customer customer) {
		this.customers.add(customer);
	}
	
	public Customer getCustomerById(String custId) {
		
		for (Customer customer : this.customers) {
			
			if(customer.getCustomerId().equalsIgnoreCase(custId))
				return customer;
		}
		
		//if customer with specified Id doesnt not exist
		return null;
		
	}
	
	//Getters and Setters
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public void display() {
		
		for (Customer customer : customers) {
			
			// Code Here
			String completeBillDetails = "Customer Id : " + customer.getCustomerId() + "\nCustomer Full Name : "
					+ customer.getCustFullName() + "\nCustomer Email ID : " + customer.getCustEmailId();
			System.out.println(completeBillDetails);
			customer.display();
		}
		
	}
	
	
	
}
