package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

public class LoginTest {
	
	LoginPage lp = new LoginPage();
	
	DataFile df = new DataFile();
	
	

	/*String wrongEmail = "nfjkdnfjdnkd";
	String wrongPassword = "sbsjfndfnkdnfdka";
	String invalidEmail = "sbnsdjhfs@#$";
	String globalErr = "Please check your card number / username or password and try again.";
	String emptyEmailErr = "Please enter your username or card number.";
	String emptyPassword = "Please enter your password.";
	String emailWithSpecial = "Please enter a username or card number without special characters.";*/
	
	
  @BeforeMethod
  public void beforeMethod() {
	  lp.openBrowser();
	  lp.openLoginPage();    
  }
  
  @AfterMethod
  public void afterMethod() {
	  lp.closeBrowser();
  }
  
  @Test
  public void loginWithWrongEmailPasswordTest() throws InterruptedException {
	  lp.login(df.wrongEmail, df.wrongPassword); 
	  //Thread.sleep(2000);
	  Assert.assertEquals(lp.readGlobalErr(), df.globalErr);
  }
  
  @Test
  public void loginwithEmptyEmail()  throws InterruptedException {
	  lp.login("",df.wrongPassword);	
	  //Thread.sleep(2000);
	  Assert.assertEquals(lp.readLocalErr(), df.emptyEmailErr);
}
  @Test
  public void loginwithEmptyPassword()  throws InterruptedException {
	 lp.login(df.wrongEmail,"");
	 //Thread.sleep(2000);
	 Assert.assertEquals( lp.readLocalErr(), df.emptyPassword);
	   
 }
  @Test
  public void loginwithInvalidEmail()  throws InterruptedException {
	 lp.login(df.invalidEmail,df.wrongPassword);
	 //Thread.sleep(2000);
	 Assert.assertEquals(lp.readLocalErr(), df.emailWithSpecial);
  
}
}
