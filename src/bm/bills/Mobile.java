package bm.bills;

import java.util.Date;

public class Mobile extends Bill {

	private String mobileManufacturerName;
	private String mobilePlanName;
	private String mobileNumber;
	private double dataConsumedGB;
	private double minutesConsumed;

	// Mobile Class Constructor
	public Mobile(int billId, Date billDate, String billType, double billAmount, String mobileManufacturerName,
			String mobilePlanName, String mobileNumber, double dataConsumedGB, double minutesConsumed) {
		super(billId, billDate, billType, billAmount);
		this.mobileManufacturerName = mobileManufacturerName;
		this.mobilePlanName = mobilePlanName;
		this.mobileNumber = mobileNumber;
		this.dataConsumedGB = dataConsumedGB;
		this.minutesConsumed = minutesConsumed;
	}

	// return Display String
	public String billDetailsToString() {
		String billStr = "Bill Id : " + this.getBillId() + "\nBill Date : " + this.getBillDate()
				+ "\nBill Type : " + this.getBillType() + "" + "\nBill Amount : " + this.getTotalBillAmount()
				+ "\nManufacturer Name : " + this.getMobileManufacturerName() + "\nPlan Name : "
				+ this.getMobilePlanName() + "\nMobile Number : " + this.getMobileNumber() + "\nInternet Usage : "
				+ this.getDataConsumedGB() + "GB" + "\nMinutes Usage : " + this.getMinutesConsumed() + "minutes";

		return billStr;
	}

	// Getters and Setters
	public String getMobileManufacturerName() {
		return mobileManufacturerName;
	}

	public void setMobileManufacturerName(String mobileManufacturerName) {
		this.mobileManufacturerName = mobileManufacturerName;
	}

	public String getMobilePlanName() {
		return mobilePlanName;
	}

	public void setMobilePlanName(String mobilePlanName) {
		this.mobilePlanName = mobilePlanName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getDataConsumedGB() {
		return dataConsumedGB;
	}

	public void setDataConsumedGB(double dataConsumedGB) {
		this.dataConsumedGB = dataConsumedGB;
	}

	public double getMinutesConsumed() {
		return minutesConsumed;
	}

	public void setMinutesConsumed(double minutesConsumed) {
		this.minutesConsumed = minutesConsumed;
	}

}
