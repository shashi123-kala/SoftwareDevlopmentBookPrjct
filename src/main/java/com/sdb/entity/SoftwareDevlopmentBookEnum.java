package com.sdb.entity;

public enum SoftwareDevlopmentBookEnum {
	SOFTWARE_DEVELOPMENT_BOOKI("Clean Code (Robert Martin, 2008)"),
	SOFTWARE_DEVELOPMENT_BOOKII("The Clean Coder (Robert Martin, 2011)"),
	SOFTWARE_DEVELOPMENT_BOOKIII("Clean Architecture (Robert Martin, 2017)"),
	SOFTWARE_DEVELOPMENT_BOOKIV("Test Driven Development by Example (Kent Beck, 2003)"),
	SOFTWARE_DEVELOPMENT_BOOKV("Working Effectively With Legacy Code (Michael C. Feathers, 2004)");

	String name;

	SoftwareDevlopmentBookEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
