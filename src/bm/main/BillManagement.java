package bm.main;

import java.util.ArrayList;

import bm.customer.Customer;
import bm.customer.IDisplay;

public class BillManagement implements IDisplay {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	// Adding new Customer to Customer List using Insertion Sort
	public void addCustomers(Customer customer) throws Exception {

		int key = customer.getCustomerId();
		int listSize = this.customers.size();

		if (listSize > 0 && this.customers.get(listSize - 1).getCustomerId() > key) {

			for (int i = 0; i < listSize; i++) {

				if (key < this.customers.get(i).getCustomerId()) {

					this.customers.add(this.customers.get(listSize - 1));

					for (int j = listSize - 1; j > i; j--)
						this.customers.set(j, this.customers.get(j - 1)); // move all customers by 1 place to right

					this.customers.set(i, customer); // add new customer to list at sorted position
					// System.out.println("New Customer Added");
					break;

				} else if (key == this.customers.get(i).getCustomerId()) {
					throw new Exception("Customer with same id already exist.");
				}
			}

		} else {

			this.customers.add(customer);

		}

	}

	// Finding Customer by Id and printing Details if Customer found else throws error
	public Customer getCustomerById(int custId) throws Exception {

		for (Customer customer : this.customers) {

			if (customer.getCustomerId() == custId)
				return customer;
		}

		throw new Exception("Customer with id " + custId + " doesn't exist");
		// if customer with specified Id doesnt not exist
		// return exception error;

	}

	// Getters and Setters
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	// Display details of All customers
	@Override
	public void display() {

		for (Customer customer : customers) {

			customer.display();
		}

	}

}
