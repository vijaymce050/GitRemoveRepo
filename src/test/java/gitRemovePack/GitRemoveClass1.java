package gitRemovePack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitRemoveClass1 {

	ChromeDriver driver;

	@Test
	public void test1() {
		System.out.println("This is method test1");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com");
		System.out.println("Browser is successfully launched");
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("This is method test2");
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Consent')]")).click();
		System.out.println("Clicked on Consent");
		driver.quit();
	}
	
	@Test
	public void test3() {
		System.out.println("This is method test3");
		System.out.println("This is added in Github");
		System.out.println("This is added main eclipse");
//		comment
	}
	
}
