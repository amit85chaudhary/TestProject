package selenium.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test {
public static void main(String orgs[])
{
	
System.setProperty("webdriver.chrome.driver", "F:/eclipse/selenium/chromedriver_win32/chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
System.out.println("amit");
System.out.println("amit1");
}
}
