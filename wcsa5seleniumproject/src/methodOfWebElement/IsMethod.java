package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
//        driver.get("http://omayo.blogspot.com/");
        
        //isDisplay Method
//         boolean display = driver.findElement(By.name("userid")).isDisplayed();
//		System.out.println( display );
        
        //isEnable Method
//        driver.get("https://www.instagram.com/"); 
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("wdyugvw");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("uyqgwdy");
//         Thread.sleep(1000);
//        boolean enable = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
//		System.out.println(enable);
        
        //isSelected Method   
        
        driver.get("http://omayo.blogspot.com/");
        boolean select = driver.findElement(By.xpath("//input[@value='Bag']")).isSelected();
		System.out.println(select);
		
		
		
	}

}
