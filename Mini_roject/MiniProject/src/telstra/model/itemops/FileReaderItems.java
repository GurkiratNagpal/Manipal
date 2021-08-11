package telstra.model.itemops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import teltsra.model.HealthCare;
import teltsra.model.Item;
import teltsra.model.MedicalSupplies;
import teltsra.model.PharmDrugs;

public class FileReaderItems {
	
	
	@SuppressWarnings("finally")
	public static ArrayList<PharmDrugs> ReadPharmaDrugs(){
	ArrayList<PharmDrugs> pharma_array = new ArrayList<PharmDrugs>();
	
	String File_name = "C:\\Users\\d976833\\Desktop\\pd.dat";
	try(FileInputStream input = new FileInputStream(File_name);
			ObjectInputStream in = new ObjectInputStream(input)) 
	{
		// Deserialize the objects & read 
	
		while(input.available()>0) {
			
			PharmDrugs s = (PharmDrugs) in.readObject();
			pharma_array.add(s);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return pharma_array;
	}
		
	}
	@SuppressWarnings("finally")
	public static ArrayList<HealthCare> ReadHealthCare(){
	ArrayList<HealthCare> health_array = new ArrayList<HealthCare>();
	
	String File_name = "C:\\Users\\d976833\\Desktop\\hcp.dat";
	try(FileInputStream input = new FileInputStream(File_name);
			ObjectInputStream in = new ObjectInputStream(input)) 
	{
		// Deserialize the objects & read 
	
		while(input.available()>0) {
			
			HealthCare s = (HealthCare) in.readObject();
			health_array.add(s);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return health_array;
	}
		
	}
	
	
	public static ArrayList<MedicalSupplies> ReadMedics(){
	ArrayList<MedicalSupplies> medics_array = new ArrayList<MedicalSupplies>();
	
	String File_name = "C:\\Users\\d976833\\Desktop\\ms.dat";
	try(FileInputStream input = new FileInputStream(File_name);
			ObjectInputStream in = new ObjectInputStream(input)) 
	{
		// Deserialize the objects & read 
	
		while(input.available()>0) {
			
			MedicalSupplies s = (MedicalSupplies) in.readObject();
			medics_array.add(s);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return medics_array;
	}
		
	}
	
}


