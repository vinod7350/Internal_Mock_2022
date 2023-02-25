package PlayMazaAnand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMazaAnand {

	
	 @FindBy (xpath ="((//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'])[1]//a)[2]") 
	  private WebElement select ;
	  
	  // constructor
	  public SelectMazaAnand (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	
	  public void select () {
		  select.click();
	  }
	
	
}
