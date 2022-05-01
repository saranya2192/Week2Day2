package week2day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class CheckBox {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is chcked']/following::input")).isSelected();
	System.out.println("the checkbox is selected" +selected);
	boolean selected2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is chcked']/following-sibling::input")).isSelected();
	  System.out.println("the checkbox is not selected" +selected2);
	

	}

}
