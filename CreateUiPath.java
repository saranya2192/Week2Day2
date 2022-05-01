package week2day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class CreateUiPath {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	 driver.findElement(By.name("PASSWORD")).sendKeys("leaf@12");
	  
	 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	 		String Text=driver.getTitle();
	 		System.out.println("title of the page" +Text);
	 
	
	 driver.findElement(By.xpath("//a[contains(text(),'log out')]")).click();
	 
	 driver.close();
	 
	 	}


}


