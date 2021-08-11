
package teltsra.model;

public class MedicalSupplies extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String medicalSuppliesID;
	private String type;

	public MedicalSupplies(String name, int units, double itemPrice, String itemLocation, String medicalSuppliesID,
			String type) {
		super(name, units, itemPrice, itemLocation);
		this.medicalSuppliesID = "MS-" + medicalSuppliesID;
		this.type = type;
	}

	public String getMedicalSuppliesID() {
		return medicalSuppliesID;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "MedicalSupplies [Name=" + name + ", medicalSuppliesID=" + medicalSuppliesID + ",  units=" + units
				+ ", itemPrice=" + itemPrice + ", itemLocation=" + itemLocation + " , type = " + type + "]";
	}

	@Override
	String getId() {
		// TODO Auto-generated method stub
		return medicalSuppliesID;
	}
}
