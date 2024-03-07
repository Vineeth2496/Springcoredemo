package com.edureka;

public class Client {
	public static void main(String[] args) {
		Employee eRef = new Employee(0, null, null);
		eRef.setEid(101);
		eRef.setName("AA");
		eRef.setAddress("chittor");
		System.out.println("Emp Details" +eRef);
	}
	
;
}
