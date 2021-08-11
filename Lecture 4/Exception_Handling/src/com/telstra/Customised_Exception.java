package com.telstra;
// Checked exception ---> extends Exception; unchecked ---> extends runtime
public class Customised_Exception extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1789765L;
	private String msg;

	public Customised_Exception(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	
	
	//Insufficient leave
	
	
	
	

}
