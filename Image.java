package week2day2;


		import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Image {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leafground.com/pages/Image.html");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//label[@for='home']")).click();
	  driver.findElement(By.xpath("//label[@for='position']")).click();
	  driver.close();
	  
	}


}
