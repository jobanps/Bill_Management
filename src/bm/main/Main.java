package bm.main;

import java.util.Date;


import bm.bills.Hydro;
import bm.bills.Internet;
import bm.bills.Mobile;
import bm.customer.Customer;

public class Main {


	public static void main(String[] args) {

		try {
			//New Object of Bill Management
			BillManagement billManagement = new BillManagement();

			//Customer with 2 Bills
			Customer customer1 = new Customer(11, "Harpreet", "Kaur", "harpreetkaur@gmail.com");
			customer1.addBill(new Hydro(2, new Date(1564764653627L), "Hydro", 65.35, "HydroOne", 29));
			customer1.addBill(new Internet(1, new Date(1564764613627L), "Internet", 56.60, "Roger", 500));
			
			//Customer with 4 Bills
			Customer customer2 = new Customer(121, "Preet", "Singh", "jobanps@gmail.com");
			customer2.addBill(
					new Mobile(11, new Date(), "Mobile", 250.12, "Samsung", "65 Freedom", "918123812313", 5.6, 125));
			customer2.addBill(new Hydro(121, new Date(1564714613627L), "Hydro", 123.45, "Apna Pump", 110));
			customer2.addBill(new Hydro(14, new Date(1564764623627L), "Hydro", 132.45, "Jal Pump", 120));
			customer2.addBill(new Internet(13, new Date(1564764113627L), "Internet", 241.2, "Roger", 500));

			//Customer with 1 Bills
			Customer customer3 = new Customer(14, "JOban", "Singh", "jobanps@gmail.com");
			customer3.addBill(new Internet(13, new Date(1564764613117L), "Internet", 241.2, "Roger", 500));

			//Customer with 0 Bills
			Customer customerWithNoBills = new Customer(1, "Gurpreet", "Singh", "gurupsr@gmail.com");

			//Adding new Customers
			billManagement.addCustomers(customer1);
			billManagement.addCustomers(customer2);
			billManagement.addCustomers(customer3);
			billManagement.addCustomers(customerWithNoBills);

			//Calling display function to display all details
			billManagement.display();

			try {
				// adding customer that exist
				Customer cust = billManagement.getCustomerById(121);
				cust.display();
				// Get customer that doesnt exist.
				billManagement.getCustomerById(32);

			} catch (Exception exception) {

				System.out.println("Error Occured : " + exception.getLocalizedMessage());
			}

			try {
				// Adding new customer that already exist.
				billManagement.addCustomers(customer3);

			} catch (Exception exception) {

				System.out.println("Error Occured : " + exception.getLocalizedMessage());
			}
			
			try {
				// Adding new bill that customer already have.
				customer1.addBill(new Internet(1, new Date(1564764613627L), "Internet", 56.60, "Roger", 500));

			} catch (Exception exception) {

				System.out.println("Error Occured : " + exception.getLocalizedMessage());
			}

		} catch (Exception exception) {

			System.out.println("Error Occured : " + exception.getLocalizedMessage());
		}
		
		

	}
}
