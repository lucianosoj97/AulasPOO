package teste_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testeGoogle {

	public static void main(String[] args) {
		
		WebDriverWait.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		

	}

}
