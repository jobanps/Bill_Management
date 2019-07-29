package bm.bills;

public class Hydro extends Bill {
	
	private String agencyName;
	private double unitsConsumed;
	
	//Hydro Class Constructor
	public Hydro() {
		//Code Goes Here
	}

	//Getters and Setters
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
