package week2day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class EditFields {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	  String attributeValue = driver.findElement(By.name("username")).getAttribute("value");
	  System.out.println("the attribute valueis " +attributeValue);
	  boolean enabled = driver.findElement(By.xpath("//input[@value='TestLeaf']")).isEnabled();
System.out.println(enabled);
boolean disabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
System.out.println(disabled);
driver.close();
		}
	}
