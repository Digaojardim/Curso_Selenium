import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
    @Test
	public void teste() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); 
    	WebDriver driver = new ChromeDriver();
	 //	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
    //	WebDriver driver = new FirefoxDriver();
   //  	System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
  //  	WebDriver driver = new EdgeDriver();
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.manage().window().setSize(new Dimension(120, 765));
		driver.manage().window().maximize();
		driver.quit();
	}
}
