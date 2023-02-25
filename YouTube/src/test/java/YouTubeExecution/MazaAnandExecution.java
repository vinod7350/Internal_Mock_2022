package YouTubeExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PlayMazaAnand.MazaAnandHome;
import PlayMazaAnand.SelectMazaAnand;

public class MazaAnandExecution {

	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
 		 WebDriver driver=new ChromeDriver();// object to call get method  
 		
 	  	driver.get("https://www.Youtube.com");// which url is open
 		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

 	  //	driver.manage().window().maximize();
 	  	
   MazaAnandHome mazaAnandHome =new MazaAnandHome(driver);
		
   mazaAnandHome.searctab();
   mazaAnandHome.button();
   

  SelectMazaAnand selectMazaAnand =new SelectMazaAnand(driver);
  selectMazaAnand.select();
		
	}
}
