package bm.bills;

public class Internet extends Bill {
	
	private String providerName;
	private double dataUsedGB;
	
	//Internet Class Constructor
	public Internet() {
		//Code Goes Here
	}
	
	//Getters and Setters
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
