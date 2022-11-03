package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/testproject.html");

		String myTitle = driver.getTitle();
		System.out.println(myTitle);

      List<WebElement> myOptions = driver.findElements(By.tagName("option"));
      
      for(int i=0 ; i<myOptions.size(); i++) {
    	  System.out.println(myOptions.get(i).getText());
      }
	}

}
