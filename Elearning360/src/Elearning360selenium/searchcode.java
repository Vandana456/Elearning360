package Elearning360selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform google search through chrome web browser. 
		System.setProperty("webdriver.chrome.driver","/Users/jipodj/Downloads/chromedriver");
		
//2.initialize the webdriver object through chrome driver class.
		  WebDriver browserObject = new ChromeDriver();
		  
//3. Open the web page www.google.com
			browserObject.get("https://www.google.com/");
			
//4.Locate the search bar element and send values using sendkeys
browserObject.findElement(By.name("q")).sendKeys("Gap");

//5. Locate the search button and perform click
browserObject.findElement(By.name("btnk")).submit();

// 6. close the browser
	browserObject.close();
	}

}
