package teltsra.model;

public class PharmDrugs extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pharmDrugID;

	public PharmDrugs(String name, int units, double itemPrice, String itemLocation, String pharmDrugID) {
		super(name, units, itemPrice, itemLocation);
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
		return "PharmDrugs [Name=" + name + ", pharmDrugID=" + pharmDrugID + ", units=" + units + ", itemPrice="
				+ itemPrice + ", itemLocation=" + itemLocation + "]";
	}

	@Override
	String getId() {
		// TODO Auto-generated method stub
		return pharmDrugID;
	}

}
