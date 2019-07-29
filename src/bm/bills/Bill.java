package bm.bills;

import java.util.Date;

public class Bill {

	private String billId;
	private Date billDate;
	private String billType;
	private double totalBillAmount;


	//Bill Class Constructor
	public Bill() {
		//Code goes here
	}
	
	// Getters and Setters
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
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
