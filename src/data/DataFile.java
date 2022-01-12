package data;

import utilities.Xls_Reader;

public class DataFile {
	
	Xls_Reader d = new Xls_Reader("C:\\testing\\Nirav.xlsx");
	
	
	public String wrongEmail = d.getCellData("Data1", "UserName", 3);
	public String wrongPassword = d.getCellData("Data1", "Password", 2);
	public String invalidEmail = d.getCellData("Data1", "UserName", 4);
	public String globalErr = d.getCellData("Data1", "Global Error", 2);
	public String emptyEmailErr = d.getCellData("Data1", "Email Error", 4);
	public String emptyPassword = d.getCellData("Data1", "Password Error", 3);
	public String emailWithSpecial = d.getCellData("Data1", "Email Error", 5);
	

}
