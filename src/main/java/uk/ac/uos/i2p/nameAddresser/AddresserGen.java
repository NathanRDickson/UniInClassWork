package main.java.uk.ac.uos.i2p.nameAddresser;

public class AddresserGen {
	public String fullName(String forename, String middleName, String surName) {
		
		if (forename == null ) {
			String name = "Name not valid";
			return name;
		}
		if (middleName == null) {
			middleName = " ";
		}
		if (surName == null) {
			String name = "Name not valid";
			return name;
		}
		
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