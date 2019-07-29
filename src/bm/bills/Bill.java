package bm.bills;

import java.util.Date;

public class Bill {

	private int billId;
	private Date billDate;
	private String billType;
	private double billAmount;

	// Bill Class Constructor
	public Bill(int billId, Date billDate, String billType, double billAmount) {
		this.billId = billId;
		this.billDate = billDate;
		this.billType = billType;
		this.billAmount = billAmount;
	}

	// return Display String
	public String billDetailsToString() {

		System.out.println("This is Bill Class");

		return "";
	}

	// Getters and Setters
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public double getTotalBillAmount() {
		return billAmount;
	}

	public void setTotalBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
}
