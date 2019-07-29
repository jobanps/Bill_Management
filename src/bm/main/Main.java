package bm.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import bm.bills.Hydro;
import bm.bills.Internet;
import bm.bills.Mobile;
import bm.customer.Customer;

public class Main {

	public static void main(String[] args) {
		
		BillManagement billManagement = new BillManagement();
		Customer cust1 = new Customer("3", "Jobanpreet", "Singh", "jobanps@gmail.com");
		cust1.addBill(new Mobile(12, new Date(), "Mobile", "Samsung", "65 Freedom", "918123812313", 56, 12));
		cust1.addBill(new Hydro(12, new Date(), "Hydro", "Abc", 12));
		cust1.addBill(new Internet(12, new Date(), "Hydro", "Abc", 12));
		
		
		billManagement.addCustomers(cust1);
		billManagement.display();
	
	
	/*	@SuppressWarnings("deprecation")
		Date now = new Date(119,12,03);
		System.out.println(now.toString());;
		
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

		//simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		//System.out.println(simpleDateFormat.format(now));
	*/
	}
}
