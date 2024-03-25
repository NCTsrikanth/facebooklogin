import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);
		//To invoke a Chrome Browser
		
		
		driver.get("https://www.facebook.com/");
		// Opening google website
		
		driver.findElement(By.id("email")).sendKeys("9948505290");
		driver.findElement(By.id("pass")).sendKeys("NAGAsri@1996");
	    driver.findElement(By.name("login")).click();
	  
	   driver.findElement( By.xpath("(//*[name()='image'])[1]")).click();
	   driver.findElement(By.xpath("(//span[normalize-space()='Log Out'])[1]")).click();
	    //driver.findElement(By.name()
	
  
		//driver.
	driver.close();
		
		
		
		
		

	}

}
