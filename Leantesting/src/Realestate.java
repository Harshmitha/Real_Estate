import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Realestate {
WebDriver driver= new ChromeDriver();
   //Agent
   @BeforeTest
	
	public  void AgentLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		   
		driver.manage().window().maximize();
		//Agent URL
		driver.get("  http://real-estate.itechscripts.com/agent_login.php ");
		//Credentials 
	    driver.findElement(By.xpath("//input[@id='login_email']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("agentdemo@yourmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='login_password']")).clear();
	    driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("userdemo");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
}
	    @Test(priority=0)
	    public  void AgentPost() throws InterruptedException {
	    
	    //Mousehover on Agent Zone
	    Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]"))).build().perform();
	    Thread.sleep(1000);
	    
	    //Post Property Free
	    driver.findElement(By.xpath("//a[contains(text(),'Post Property Free')]")).click();
	    Thread.sleep(1000);
	    
	    //scrolled Down
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        System.out.println("scrolled Down");
        Thread.sleep(5000);
       
        //Post property Form
        //Property For
        driver.findElement(By.xpath("//button[@title='Property For']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
        
        //Property Type
        driver.findElement(By.xpath("//button[@title='Select Property Type']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@rel='1']//a[contains(@class,'opt')]")).click();
        
        //Select Country
        driver.findElement(By.xpath("//button[@title='Select Country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/ul[1]/li[2]/a[1]")).click();
        Thread.sleep(1000);
        
        //Any city
        driver.findElement(By.xpath("//*[@id='city']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='city']/option[2]")).click();  
		Thread.sleep(1000);
        
		//locality
		driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("xyz");
		Thread.sleep(1000);
		
		//about
		driver.findElement(By.xpath("//textarea[@id='about']")).sendKeys("The Residence is Located in Mumbai");
		Thread.sleep(1000);
	
		//scrolled Down
		JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,300)");
        System.out.println("scrolled Down");
        Thread.sleep(5000);
        
        //bedroom
		driver.findElement(By.xpath("//select[@id='bedroom']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='bedroom']/option[3]")).click();  
		Thread.sleep(1000);
		
		//bathroom
		driver.findElement(By.xpath("//select[@id='bathroom']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='bathroom']/option[3]")).click();  
		Thread.sleep(1000);
		
		//belconies
		driver.findElement(By.xpath("//select[@id='belconies']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='belconies']/option[2]")).click();  
		Thread.sleep(1000);
		
		//furnish status
		driver.findElement(By.xpath("//select[@id='furns_stat']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='furns_stat']/option[3]")).click();  
		Thread.sleep(1000);
		
		//Total floor
		driver.findElement(By.xpath("//select[@id='totl_floor']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='totl_floor']/option[4]")).click();  
		Thread.sleep(1000);
		
		//Floor no
		driver.findElement(By.xpath("//select[@id='floor_no']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='floor_no']/option[4]")).click();  
		Thread.sleep(1000);
		
        //Covered area
		driver.findElement(By.xpath("//input[@id='covered_area']")).sendKeys("aaa");
		Thread.sleep(1000);
		
		//Covered area unit
		driver.findElement(By.xpath("//select[@id='covered_area_unt']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='covered_area_unt']/option[3]")).click();  
		Thread.sleep(1000);
		
		//Plot area
		driver.findElement(By.xpath("//input[@id='plot_area']")).sendKeys("zzz");
		Thread.sleep(1000);
		
		//Plot area unit
		driver.findElement(By.xpath("//select[@id='plot_area_unt']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='plot_area_unt']/option[3]")).click();  
		Thread.sleep(1000);
		
		//Carpet area
		driver.findElement(By.xpath("//input[@id='carpet_area']")).sendKeys("zzz");
		Thread.sleep(1000);
		
		//Carpet area unit
		driver.findElement(By.xpath("//select[@id='carpet_area_unt']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='carpet_area_unt']/option[3]")).click();  
		Thread.sleep(1000);
		
		//scrolled Down
		JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("window.scrollBy(0,500)");
        System.out.println("scrolled Down");
        Thread.sleep(5000);
        
        //Availability
        driver.findElement(By.xpath("//input[@id='availability']")).clear();
        driver.findElement(By.xpath("//input[@id='availability']")).sendKeys("December,2020");
		Thread.sleep(2000);
		
		//Construction
		driver.findElement(By.xpath("//select[@id='constrctn_age']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@id='constrctn_age']/option[4]")).click();  
		Thread.sleep(1000);
		
		//Monthly Rent
		driver.findElement(By.xpath("//input[@id='mnthly_rent']")).sendKeys("10,000");
		Thread.sleep(1000);
		
		//Security Amount 
		driver.findElement(By.xpath("//input[@id='securty_amnt']")).sendKeys("5000");
		Thread.sleep(1000);
		
		//Maintenance charge 
		driver.findElement(By.xpath("//input[@id='maintnc_chrg']")).sendKeys("3000");
		Thread.sleep(1000);
		
		//upload photo
		WebElement upload=driver.findElement(By.xpath("//input[@id='app_photo']"));
	    upload.sendKeys("E:\\Residence.jpe");
		
	    //you tube link
	    driver.findElement(By.xpath("//input[@id='video']")).sendKeys("qwert");
		Thread.sleep(1000);
		
		//Post
		driver.findElement(By.xpath("//input[@value='Post Now']")).click();
	    Thread.sleep(2000);
	    
	    //Alert
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
	    
	}
	    //Admin
    	@Test(priority=1)	
    	
    	public void Admin() throws InterruptedException {
    		// TODO Auto-generated method stub
    		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    		   
    		driver.manage().window().maximize();
    		//Admin URL
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
    	
          //User
          @Test(priority=2)
          public void User() throws InterruptedException {
        		
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
          
          //Admin Delete
          public void AdminDelete() throws InterruptedException {
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
      	    
      	    
      	    //Delete
      	    driver.findElement(By.xpath("//img[@src='icon/delete.png']")).click();
      	    Thread.sleep(2000);
      	    
      	  //Alert
              driver.switchTo().alert().dismiss();
              Thread.sleep(3000);
      }
      	  //Close
          @AfterTest()
          public void Close() {
        	  driver.close();
          }
      }


	
	
	
	

	


