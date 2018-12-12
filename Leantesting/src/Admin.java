import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		//Agent URL
		driver.get("http://real-estate.itechscripts.com/admin ");
		
		//Credentials 
	    driver.findElement(By.xpath("//input[@id='username']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    
	    driver.findElement(By.xpath("//input[@id='password']")).clear();
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    
	    //Properties
	    driver.findElement(By.xpath("//span[contains(text(),'Properties')]")).click();
	    Thread.sleep(2000);
	    
	    //Properties listing
	    driver.findElement(By.xpath("//li[@class='active']//a[@href='properties_listing.php']")).click();
	    Thread.sleep(2000);
	    
	    //3nd page
	    driver.findElement(By.xpath("//a[@href='#'][contains(text(),'3')]")).click();
	    Thread.sleep(2000);
	    
	    //Enable
	    driver.findElement(By.xpath("//img[@src='icon/edit.png']")).click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    

	}

}
