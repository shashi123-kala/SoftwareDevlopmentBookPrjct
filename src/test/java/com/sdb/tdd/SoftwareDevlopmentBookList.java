package com.sdb.tdd;

import com.sdb.entity.SoftwareDevelopmentBook;

public class SoftwareDevlopmentBookList {

	public static SoftwareDevelopmentBook GivenASoftwareDevelopmentIBook() {
		SoftwareDevelopmentBook book = new SoftwareDevelopmentBook("Clean Code (Robert Martin, 2008)");
		return book;
	}

	public static SoftwareDevelopmentBook GivenASoftwareDevelopmentIIBook() {
		SoftwareDevelopmentBook book = new SoftwareDevelopmentBook("The Clean Coder (Robert Martin, 2011)");
		return book;
	}

}
