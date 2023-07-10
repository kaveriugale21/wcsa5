package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
//        WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
//        user.sendKeys("kaveri");
//        Thread.sleep(1000);
//        user.clear();
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kvaeriugale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='passContainer' and (@class='_6luy _55r1 _1kbt')]")).sendKeys("1234");
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	    
	
	
	
	
	
	}

}
