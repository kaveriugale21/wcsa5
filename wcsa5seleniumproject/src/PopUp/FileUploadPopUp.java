package PopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        
        Runtime.getRuntime().exec("./autoITPrograms/file1.exe");
        

	}

}
