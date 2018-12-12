import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class User {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		
		//User URL
		driver.get("http://real-estate.itechscripts.com ");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	    Thread.sleep(3000);
	    
		//Credentials 
	    driver.findElement(By.xpath("//input[@id='login_username']")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='login_username']")).sendKeys("userdemo@yourmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='login_password']")).clear();
	    driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("userdemo");
	    driver.findElement(By.xpath("//button[contains(text(),'Login Now')]")).click();
	    Thread.sleep(3000);
		
	    //Alert
	    driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        
        //Contract
        driver.findElement(By.xpath("//button[@title='Contract']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select input-lg dropup open']//li[@rel='2']//a[@tabindex='0']")).click();
	    Thread.sleep(1000);
	    
	    //Type
	    driver.findElement(By.xpath("//button[@title='Type']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@class='text'][contains(text(),'Residential House')]")).click();
	    Thread.sleep(1000);
	    
	    //Any Country
	    driver.findElement(By.xpath("//button[@title='Any Country']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select input-lg dropup open']//li[@rel='1']//a[@tabindex='0']")).click();
	    Thread.sleep(1000);
	    
	    //Any City
	    driver.findElement(By.xpath("//select[@id='city']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='city']/option[2]")).click();  
		Thread.sleep(1000);
		
		//+Advance Search
		driver.findElement(By.xpath("//a[@id='ads-trigger']")).click();  
		Thread.sleep(1000);
		
		//Minimum Price
		driver.findElement(By.xpath("//input[@id='min_price']")).clear();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='min_price']")).sendKeys("0");
	    Thread.sleep(1000);
		
        //Maximum Price
	    driver.findElement(By.xpath("//input[@id='max_price']")).clear();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='max_price']")).sendKeys("10000");
	    Thread.sleep(1000);
	    
	    //Submit
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	    //xyz
	    driver.findElement(By.xpath("//a[contains(text(),'xyz')]")).click();
	    Thread.sleep(1000);
		
	    //scrolled Down
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
        System.out.println("scrolled Down");
        Thread.sleep(3000);
        
        //Contact Agent
        driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right btn-sm']")).click();
	    Thread.sleep(1000);
	    
	    //scrolled Down
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,400)");
        System.out.println("scrolled Down");
        Thread.sleep(3000);
		
        /*//Contact Details
        //Mobile no.
        driver.findElement(By.xpath("//ul[@class='list-group']//li[1]")).sendKeys("9876345678");
	    Thread.sleep(1000);
	    
	    //Work phone
	    driver.findElement(By.xpath("//ul[@class='list-group']//li[2]")).sendKeys("");
	    Thread.sleep(1000);
		
	    //Email id
	    driver.findElement(By.xpath("//ul[@class='list-group']//li[3]")).sendKeys("");
	    Thread.sleep(1000);*/
	    
	    //Contact Details
	    //Contact Name
	    driver.findElement(By.xpath("//input[@id='cntact_name']")).sendKeys("");
	    Thread.sleep(1000);
	    
	    //Email Address
	    driver.findElement(By.xpath("//input[@id='cntact_email']")).sendKeys("");
	    Thread.sleep(1000);
	    
	    //Contact Phone no.
	    driver.findElement(By.xpath("//input[@id='cntact_phone']")).sendKeys("");
	    Thread.sleep(1000);
	    
	    //Submit
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
	    
	    //scrolled up
	    JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("window.scrollBy(0,400)");
        System.out.println("scrolled up");
        Thread.sleep(3000);
	    
	    //Welcome user demo
	    driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
	    Thread.sleep(1000);
	    
	    //Logout
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    Thread.sleep(1000);
	    
	    
	    
	}

}
