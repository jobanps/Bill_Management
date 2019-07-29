package bm.bills;

import java.util.Date;

public class Bill {

	private int billId;
	private Date billDate;
	private String billType;
	private double totalBillAmount;


	//Bill Class Constructor
	public Bill(int billId, Date billDate, String billType) {
		this.billId = billId;
		this.billDate = billDate;
		this.billType = billType;
	}
	//return Display String
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
		return totalBillAmount;
	}
	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
}
