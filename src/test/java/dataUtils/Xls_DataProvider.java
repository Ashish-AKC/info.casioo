package dataUtils;

public class Xls_DataProvider {
	
	public void DataProvider() {
		
		//Below data fetching from Excel file
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Admin\\Desktop\\Project\\info.casioo\\Excels\\SampleExcel.xlsx");
				
		//Xls_Reader reader = new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\Ashish\\info.casioo\\src\\test\\java\\excelTestData\\SampleExcel.xlsx");
		
		String firstName = reader.getCellData("Registration", "Firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("Registration", "Lastname", 2);
		System.out.println(lastName);

		String emailId = reader.getCellData("Registration", "Email-id", 2);
		System.out.println(emailId);

		String password = reader.getCellData("Registration", "Password", 2);
		System.out.println(password);

		String CoPassword = reader.getCellData("Registration", "CoPassword", 2);
		System.out.println(CoPassword);
		
		String username = reader.getCellData("Login", "Username", 2);
		System.out.println(username);
		
		String lpassword = reader.getCellData("Login", "Password", 2);
		System.out.println(lpassword);


	}

		
	}


