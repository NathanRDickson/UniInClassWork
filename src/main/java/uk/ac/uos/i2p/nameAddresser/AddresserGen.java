package uk.ac.uos.i2p.arraySorter.nameAddresser;

public class AddresserGen {
	public String fullName(String forename, String middleName, String surName) {
		
		forename = forename.toUpperCase();
		middleName = middleName.toUpperCase();
		surName = surName.toUpperCase();
		
		char forenameLetter = forename.charAt(0);
		char middleNameLetter = middleName.charAt(0);
		
		String name = forenameLetter + " " + middleNameLetter + " " + surName;
		
		name = name.replace("   "," ");
		name = name.replace("  "," ");
		
		return name;
	}
}

// Test Comment 