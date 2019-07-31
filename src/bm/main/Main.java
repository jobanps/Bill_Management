package bm.main;

import java.util.Date;
import bm.bills.Hydro;
import bm.bills.Internet;
import bm.bills.Mobile;
import bm.customer.Customer;

public class Main {

	public static void main(String[] args) {
		
		try {
		
		BillManagement billManagement = new BillManagement();
		Customer customer1 = new Customer(11, "Harpreet", "Kaur", "harpreetkaur@gmail.com");
		customer1.addBill(new Hydro(2, new Date(), "Hydro",45.35, "HydroOne", 29));
		customer1.addBill(new Internet(1, new Date(), "Internet",56.60, "Roger", 500));
		
		
		Customer customer2 = new Customer(121, "Preet", "Singh", "jobanps@gmail.com");
		customer2.addBill(new Mobile(11, new Date(), "Mobile", 250.12, "Samsung", "65 Freedom", "918123812313", 5.6, 125));
		customer2.addBill(new Hydro(121, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer2.addBill(new Hydro(14, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer2.addBill(new Internet(13, new Date(), "Internet",241.2, "Roger", 500));
		
		Customer customer3 = new Customer(14, "JOban", "Singh", "jobanps@gmail.com");
		customer3.addBill(new Mobile(110, new Date(), "Mobile", 250.12, "Samsung", "65 Freedom", "918123812313", 5.6, 125));
		customer3.addBill(new Hydro(12, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer3.addBill(new Hydro(14, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer3.addBill(new Internet(13, new Date(), "Internet",241.2, "Roger", 500));
		
		Customer customer4 = new Customer(13, "Jobanpreet", "Singh", "jobanps@gmail.com");
		customer4.addBill(new Mobile(11, new Date(), "Mobile", 250.12, "Samsung", "65 Freedom", "918123812313", 5.6, 125));
		customer4.addBill(new Hydro(12, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer4.addBill(new Hydro(14, new Date(), "Hydro",123.45, "Water Pump", 120));
		customer4.addBill(new Internet(13, new Date(), "Internet",241.2, "Roger", 500));

		Customer customerWithNoBills = new Customer(1, "Gurpreet", "Singh", "gurupsr@gmail.com");
		
		
		billManagement.addCustomers(customer1);
		billManagement.addCustomers(customer2);
		billManagement.addCustomers(customer3);
		billManagement.addCustomers(customer4);
		billManagement.addCustomers(customerWithNoBills);
		
	
		//billManagement.addCustomers(cust2);
		billManagement.display();
	
		} catch(Exception exception) {
			
			System.out.println("Error Occured : "  + exception.getLocalizedMessage());
		}
	}
}
