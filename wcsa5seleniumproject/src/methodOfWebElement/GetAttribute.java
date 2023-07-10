package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        
        //getattributemethod
//        driver.get("http://omayo.blogspot.com/");
//        WebElement kau = driver.findElement(By.xpath("//input[@type='text']"));
//       System.out.println(kau.getAttribute("type"));
        
        
        //getcssvalue  method
        
//        driver.get("https://www.orangehrm.com/");
//       WebElement ku = driver.findElement(By.xpath("//input[@name='action_request']"));
//        System.out.println(ku.getCssValue("color"));
      
        //getRect method
//        driver.get("https://www.selenium.dev/");
//        WebElement kau = driver.findElement(By.xpath("//h2[text()='News']"));
//        Rectangle kk = kau.getRect();
//        
//        int height = kk.getHeight();
//        int width = kk.getWidth();
//        int xaxis = kk.getX();
//        int yaxis = kk.getY();
//        System.out.println("Heigh= "+height+" Width= "+width+" X-axis= "+xaxis+" Y-axis= "+yaxis);
        
        //getSize Method
        
        driver.get("https://www.selenium.dev/");
        WebElement kau = driver.findElement(By.xpath("//h2[text()='News']"));
        Dimension k1 = kau.getSize();
        int hight = k1.getHeight();
        int width = k1.getWidth();
        System.out.println("Heigh= "+hight+" Width= "+width);
            
	}

}
