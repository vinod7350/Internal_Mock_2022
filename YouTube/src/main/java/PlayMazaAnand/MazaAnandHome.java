package PlayMazaAnand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MazaAnandHome {
	 @FindBy (xpath ="//input[@id='search']") 
	  private WebElement searchtab ;
	
	  @FindBy (xpath ="//button[@id='search-icon-legacy']") 
	  private WebElement button ;
	
	 
	  // constructor
	  public MazaAnandHome (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  // method 
	  public void searctab (String sName) {
		  searchtab.sendKeys(sName);
	  }
	  public void button () {
		  button.click();
	  }
	 
	  
}
