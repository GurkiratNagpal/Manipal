package teltsra.model;

public class PharmDrugs extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pharmDrugID;

	public PharmDrugs(int units, int itemPrice, String itemLocation, String pharmDrugID) {
		super(units, itemPrice, itemLocation);
		this.pharmDrugID = "PD-" + pharmDrugID;
	}

	public String getPharmDrugID() {
		return pharmDrugID;
	}

	public void setPharmDrugID(String pharmDrugID) {
		this.pharmDrugID = pharmDrugID;

	}

	@Override
	public String toString() {
		return "PharmDrugs [pharmDrugID=" + pharmDrugID + ", units=" + units + ", itemPrice=" + itemPrice
				+ ", itemLocation=" + itemLocation + "]";
	}

}
