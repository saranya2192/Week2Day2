package week2day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class CreateAccount {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	 driver.findElement(By.linkText("CreateAccount")).click();
	 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	 driver.findElement(By.xpath("//textarea[@nae='description']")).sendKeys("Selenium Automation Tester");
	 
	 driver.findElement(By.id("groupNameLocal")).sendKeys("test");
	 driver.findElement(By.id("officialSiteName")).sendKeys("TestLeaf");
	 driver.findElement(By.xpath("//td[@id='ext-gen649'']/input")).sendKeys("200000");
	 driver.findElement(By.linkText("Create Account")).click();
	 driver.close();
	 
	 	}


}
