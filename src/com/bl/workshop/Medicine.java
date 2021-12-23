package com.bl.workshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {
		public enum Type{ ALLOPATHY, AYURVEDIC};

	String companyName;
	Type type;
	Date mfgDate;
	Date expDate;
	String[] composition;
	String name;

	@Override
	public String toString() {
		return "Medicine Details \n CompanyName :" + companyName + ", \n Type :" + type + ", \n MfgDate :" + mfgDate + ",\n ExpDate :"
				+ expDate + ",\n Composition :" + Arrays.toString(composition) + "\n"+"Name of medicine :"+name;
	}
}
