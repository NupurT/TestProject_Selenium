package defaultPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeGridTest {

	public static void main(String args[]){

		new DesiredCapabilities();
		//		 Android Phone Chrome
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID"); 
		caps.setCapability("deviceName", "192.168.5.15:5555");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("browserName", "chrome");

		//	       Android Phone Firefox
		//		  caps.setCapability("platformName", "ANDROID"); 
		//	       caps.setCapability("deviceName", "192.168.5.15:5555");
		//	       caps.setCapability("appPackage", "org.mozilla.firefox");
		//	       caps.setCapability("browserName", "firefox");
		//	       caps.setCapability("appActivity", "org.mozilla.gecko.BrowserApp");


		RemoteWebDriver driver=null;
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.3.169:8080/wd/hub"), caps);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				  driver.navigate().to("http://google.com");
				  WebElement search_editbox = driver.findElement(By.name("q"));
				  search_editbox.sendKeys("Test");

	}

}
