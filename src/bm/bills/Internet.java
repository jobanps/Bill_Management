package bm.bills;

import java.util.Date;

public class Internet extends Bill {

	private String providerName;
	private double dataUsedGB;

	// Internet Class Constructor
	public Internet(int billId, Date billDate, String billType, double billAmount, String provideName,
			double dataUsedGB) {
		super(billId, billDate, billType, billAmount);

		this.providerName = provideName;
		this.dataUsedGB = dataUsedGB;
	}

	public String billDetailsToString() {
		String billStr = "Bill Id : " + this.getBillId() + "\nBill Date : " + this.getBillDate().getTime()
				+ "\nBill Type : " + this.getBillType() + "" + "\nBill Amount : " + this.getTotalBillAmount()
				+ "\nProvider Name : " + this.getProviderName() + "\nInternet Usage : " + this.getDataUsedGB();

		return billStr;
	}

	// Getters and Setters
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getDataUsedGB() {
		return dataUsedGB;
	}

	public void setDataUsedGB(double dataUsedGB) {
		this.dataUsedGB = dataUsedGB;
	}

}
