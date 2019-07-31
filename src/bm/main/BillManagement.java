package bm.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bm.customer.Customer;
import bm.customer.IDisplay;

public class BillManagement implements IDisplay {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public void addCustomers(Customer customer) throws Exception {

		int key = customer.getCustomerId();
		int listSize = this.customers.size();
		
		if (listSize > 0  && this.customers.get(listSize-1).getCustomerId() > key) {

			for (int i = 0; i < listSize; i++) {

				if (key < this.customers.get(i).getCustomerId()) {

					
					this.customers.add(this.customers.get(listSize - 1));

					for (int j = listSize - 1; j > i; j--) 
						this.customers.set(j, this.customers.get(j - 1)); //move all customers by 1 place to right

					this.customers.set(i, customer); // add new customer to list at sorted position
					System.out.println("New Customer Added");
					break;
					
				} else if (key == this.customers.get(i).getCustomerId()) {
					throw new Exception("Customer with same id already exist.");
				}
			}

		} else {
			
			this.customers.add(customer);
			System.out.println("New Customer Added");
		}

	}

	public Customer getCustomerById(int custId) {

		for (Customer customer : this.customers) {

			if (customer.getCustomerId() == custId)
				return customer;
		}

		// if customer with specified Id doesnt not exist
		return null;

	}

	// Getters and Setters
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public void sortCustomers() {

	}

	@Override
	public void display() {

		for (Customer customer : customers) {

			// Code Here
			String completeBillDetails = "\n\nCustomer Id : " + customer.getCustomerId() + "\nCustomer Full Name : "
					+ customer.getCustFullName() + "\nCustomer Email ID : " + customer.getCustEmailId();
			System.out.println(completeBillDetails);
			customer.display();
		}

	}

}
