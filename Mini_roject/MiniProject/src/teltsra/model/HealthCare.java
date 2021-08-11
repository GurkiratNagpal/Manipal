package teltsra.model;

public class HealthCare extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String HealthCareID;

	public HealthCare(String name, int units, double itemPrice, String itemLocation, String healthCareID) {
		super(name, units, itemPrice, itemLocation);
		HealthCareID = "HCP-" + healthCareID;
	}

	public String getHealthCareID() {
		return HealthCareID;
	}


	@Override
	public String toString() {
		return "HealthCare [Name=" + name + ", HealthCareID=" + HealthCareID + ", units=" + units + ", itemPrice="
				+ itemPrice + ", itemLocation=" + itemLocation + "]";
	}

	@Override
	public int getUnits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String getId() {
		
		return HealthCareID;
	}



}
