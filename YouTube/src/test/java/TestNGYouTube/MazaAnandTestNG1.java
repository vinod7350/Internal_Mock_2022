package TestNGYouTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PlayMazaAnand.MazaAnandHome;
import PlayMazaAnand.SelectMazaAnand;

public class MazaAnandTestNG1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe3");
 		driver=new ChromeDriver();// object to call get method  
 		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
 	  	driver.get("https://www.Youtube.com");// which url is open
 		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		 System.out.println("test");
		 MazaAnandHome mazaAnandHome =new MazaAnandHome(driver);
			
		 mazaAnandHome.searctab("Maza Anand Harpla");
		 Thread.sleep(3000);
		 mazaAnandHome.button();
		 
          Thread.sleep(3000);
		 SelectMazaAnand selectMazaAnand =new SelectMazaAnand(driver);
		 
		 SoftAssert soft = new SoftAssert();
		 String actualUrl= driver.getCurrentUrl();
		 System.out.println(actualUrl);
	     String expectedUrl  = "https://www.youtube.com/results?search_query=Maza+Anand+Harpla";
	 Assert.assertEquals(actualUrl, expectedUrl,"Verify URL");
	//	soft.assertEquals(actualUrl, expectedUrl,"Verify URL");
		 selectMazaAnand.select();
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	// It's Most Big Advantage is the , TEstNG not need Mian method to ecxecute the programm .
	// i.e Without main method are you execute any thing .
	// it contains non-static method 
	// to call non-static method do not need object 
	//of class and main method
	// at execution sequence of method are same 
	// while you change sequence then out put 
	//will be the in same sequence
	//BeforeClass
	//BeforeMethod
    //Test
	//AfterMethod
	//AfterClass

}
