package com.practice.firstProject.exception;

public class CloudVendorNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	

	public CloudVendorNotFoundException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public CloudVendorNotFoundException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	
}
