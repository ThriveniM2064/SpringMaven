package com.xworkz.institute.constants;

public enum DBConstants {
	USERNAME("root"), PASSWORD("Thrivenivarma2**"), URL("jdbc:mysql://localhost:3306/course");

	private String value;

	private DBConstants(String value) {
		System.out.println(value);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
