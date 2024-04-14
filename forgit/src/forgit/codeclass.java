package forgit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codeclass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		    driver.get("https://facebook.com");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		   /* Dimension d=new Dimension(200,300);
		    driver.manage().window().setSize(d);*/
		    Point p=new Point (300,400);
		    driver.manage().window().setPosition(p);
       driver.close();

}
}