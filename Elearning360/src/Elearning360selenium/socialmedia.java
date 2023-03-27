package Elearning360selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class socialmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform google search through chrome web browser. 
		System.setProperty("webdriver.chrome.driver","/Users/jipodj/Downloads/chromedriver");
		
		//2.initialize the webdriver object through chrome driver class.
		  WebDriver browserObject = new ChromeDriver();
		  
		// 3. Open the web page www.google.com
			browserObject.get("https://www.itlearn360.com/login");
			
			// 4. Locate facebook icons using className locator and perform click
	        browserObject.findElement(By.className("fa-facebook")).click();
		// 5. Navigate back on main page using navigate and back method 
	        browserObject.navigate().back();

	     // 6. Locate twitter icons using className locator and perform click
	        browserObject.findElement(By.className("fa-twitter")).click();
		// 7. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 8. Locate instagram icons using className locator and perform click
	        browserObject.findElement(By.className("fa-instagram")).click();
		// 9. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 10. Locate youtube icons using className locator and perform click
	        browserObject.findElement(By.className("fa-youtube")).click();
		// 11. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 12. Locate linkedIn icons using className locator and perform click
	        browserObject.findElement(By.className("fa-linkedin")).click();
		// 13. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();



	}

}
