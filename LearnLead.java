package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
 ChromeDriver driver = new ChromeDriver();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.manage().window().maximize();
 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
  driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("CreateLead")).click();
 driver.findElement(By.id("createLeadFrom_CompanyName")).sendKeys("Testleaf");
 driver.findElement(By.id("createLeadFrom_FirstName")).sendKeys("saranya");
 driver.findElement(By.id("createLeadFrom_LastName")).sendKeys("sakthi");
 driver.findElement(By.name("submitButton")).click();
 String Text = driver.findElement(By.id("company name")).getText();
  System.out.println("Company Name is:" +Text);

}

}

