package week2day2;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
 ChromeDriver driver = new ChromeDriver();
  driver.get("http://leafground.com/pages/Link.html");
  driver.manage().window().maximize();
  String attribute = driver.findElement(By.linkText("find where am supposed to go without clciking me?")).getAttribute("href");
  System.out.println("the href value is "+attribute);
  driver.close();
  
}
}
