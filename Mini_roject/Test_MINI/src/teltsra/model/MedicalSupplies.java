
package teltsra.model;

public class MedicalSupplies extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String medicalSuppliesID;
	private String type;

	public MedicalSupplies(int units, int itemPrice, String itemLocation, String medicalSuppliesID, String type) {
		super(units, itemPrice, itemLocation);
		this.medicalSuppliesID = "MS-" + medicalSuppliesID;
		this.type = type;
	}

	public String getMedicalSuppliesID() {
		return medicalSuppliesID;
	}

	public void setMedicalSuppliesID(String medicalSuppliesID) {
		this.medicalSuppliesID = medicalSuppliesID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MedicalSupplies [medicalSuppliesID=" + medicalSuppliesID + ", type=" + type + ", units=" + units
				+ ", itemPrice=" + itemPrice + ", itemLocation=" + itemLocation + "]";
	}
}
