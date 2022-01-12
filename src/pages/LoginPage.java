package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	  	driver = new FirefoxDriver();
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=0Ov5M-XkN9M&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiME92NU0tWGtOOU0iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzMzgwOTYyNCwiaWF0IjoxNjMzODA4NDI0LCJqdGkiOiJkYzlkOWM1MS1hZGFiLTRhNDItODMzMC1hZmNhNmQ3NWRjZDciLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.FpZMEse7lkx4NC49JwyKvhoh5IIMeG_QV9ygA368yDEARQd3wvMbhT9sCYZOGRN2XfP_v_PSNWyeQmhoOtb2BXHQHZRZ42Z_EkSaqUqNcqg2FVdS2lfJ_qVvmNp3o4LbndgyaBBw2R1bULd3Cq_vcudBzX-400SwTAzj_sNynfyzVfrXvUrifFkELSMi7sLiWs4AX8758pioyvXBxbkJ0_ZYbt2PBudU1vFrHp-PQa3UeEp3DNV5OjU17m0LRSgwoU9FGpPaCVaqsoLBSAck_ekEewnWc2psLePvEjwhnJL2Of5bJh5_JiRYwizELA-ITqp7U7hSz7Gv0IRBGaxy5A&preferred_environment=");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}
	public void closeBrowser() {
		driver.quit();
	}
	
	public void login(String a, String b) throws InterruptedException {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
	}
	/*public void login1() throws InterruptedException {
		driver.findElement(By.id("")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
	}*/
		
		/*public void login2() throws InterruptedException {
			driver.findElement(By.id("usernameInput-input")).sendKeys("");
			driver.findElement(By.name("password")).sendKeys("sdgasfhfhags");
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(2000);
		}
			
			public void login3() throws InterruptedException {
				driver.findElement(By.id("usernameInput-input")).sendKeys("dsfhdgdfgasdgs#$%#$%");
				driver.findElement(By.name("password")).sendKeys("sdgasfhfhags");
				driver.findElement(By.id("signIn")).click();
				Thread.sleep(2000);
	}*/
	public String readGlobalErr() {
		String actualErr = driver.findElement(By.id("globalError")).getText();
		System.out.println(actualErr);
		return actualErr;
		
	}
	public String readLocalErr() {
		String actualErr = driver.findElement(By.className("Error__text")).getText();
		System.out.println(actualErr);
		return actualErr;

}
}
