package bm.bills;

public class Mobile extends Bill {
	
	private String mobileManufacturerName;
	private String mobilePlanName;
	private String mobileNumber;
	private double dataConsumedGB;
	private double minutesConsumed;
	
	//Mobile Class Constructor
	public Mobile() {
		//Code goes Here
	}

	//Getters and Setters
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
