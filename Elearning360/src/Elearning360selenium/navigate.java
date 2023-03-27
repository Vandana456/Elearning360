package Elearning360selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		// 1. setup the property of chromedriver to perform "navigate" through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "/Users/jipodj/Downloads/ChromeDriver");

		//2.Initialize web driber object through Chrome Driver class.
			WebDriver browserObject = new ChromeDriver();
			
		// 3. Open the web page https://www.facebook.com/
			browserObject.get("http:/www.facebook.com");
			
		// 4. In the print line we are using getTitle method .This will give the title of current page
		    System.out.println("this is"+browserObject.getTitle()+ "website");
		    
		    //5.in next line we are using getCurrentUrl method .this will give the current url of the webpage.
		    System.out.println("Url is:"+browserObject.getCurrentUrl());
		    
		  //6.using the navigate method we move to the nest website www.instagram.com
		  browserObject.navigate().to("http://www.instagram.com");
		  
		  
		//7.In the print line we are using getTitle method .This will give the title of current page.
		  System.out.println("this is"+browserObject.getTitle()+"website");
		  
		//8.In next line we are using getCurrentUrl method .This will give the current url of the webpage
		  System.out.println("Url is"+ browserObject.getCurrentUrl());
		  
		//9. Using navigate method we again move to next website http://www.twitter.com/
		  browserObject.navigate().to ("http://www.twitter.com");

		//10. Now we use back method along with navigate method to get back to the last visited website that is "http://www.instagram.com/"  
		browserObject.navigate().back();
		System.out.println("this is"+browserObject.getTitle()+ "website");
		System.out.println("Url is"+browserObject.getCurrentUrl());

		//11.// 11. Now we use back method again to navigate back to the first website that is "https://www.facebook.com/"
		browserObject.navigate().back();
		System.out.println("this is"+browserObject.getTitle()+"website");
		System.out.println("Url is"+browserObject.getCurrentUrl());

		//12.// 12. Now we use forward method to to move forward direction that is to "http://www.instagram.com"
		browserObject.navigate().forward();

	}

}
