package bm.bills;

import java.util.Date;

public class Hydro extends Bill {

	private String agencyName;
	private double unitsConsumed;

	// Hydro Class Constructor
	public Hydro(int billId, Date billDate, String billType, double billAmount, String agencyName,
			double unitsConsumed) {
		super(billId, billDate, billType, billAmount);
		this.agencyName = agencyName;
		this.unitsConsumed = unitsConsumed;
	}

	public String billDetailsToString() {
		String billStr = "Bill Id : " + this.getBillId() + "\nBill Date : " + this.getBillDate().getTime()
				+ "\nBill Type : " + this.getBillType() + "" + "\nBill Amount : " + this.getTotalBillAmount()
				+ "\nAgency Name : " + this.getAgencyName() + "\nUnit Consumed : " + this.getUnitsConsumed();

		return billStr;
	}

	// Getters and Setters
	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

}
