package teltsra.model;

public class HealthCare extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String HealthCareID;

	public HealthCare(int units, int itemPrice, String itemLocation, String healthCareID) {
		super(units, itemPrice, itemLocation);
		HealthCareID = "HCP-" + healthCareID;
	}

	public String getHealthCareID() {
		return HealthCareID;
	}

	public void setHealthCareID(String healthCareID) {
		HealthCareID = healthCareID;
	}

	@Override
	public String toString() {
		return "HealthCare [HealthCareID=" + HealthCareID + ", units=" + units + ", itemPrice=" + itemPrice
				+ ", itemLocation=" + itemLocation + "]";
	}

}
