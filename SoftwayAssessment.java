
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SoftwayAssessment {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		
			WebDriver dr = new EdgeDriver();
			
			//Open flipkart website
			dr.get("https://www.flipkart.com/");
			
			dr.manage().window().maximize();
					
			// Search for a product
			dr.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("readmi note 11 pro");
			Thread.sleep(2000);
			
			//Select first product in the list
			dr.findElement(By.xpath("//li[@class=\"Y5N33s\"][1]")).click();
	
			//Capture and print the price of product
			String price=dr.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
			System.out.println("Price="+price);
			
			// Open the product details
			dr.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).click();
			Thread.sleep(5000);
			
			//Add product to the cart
			dr.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			Thread.sleep(2000);
			
			//Increase the quantity by 1
			dr.findElement(By.xpath("//button[text()='+']")).click();
			
			//Capture and print the new price
		String newprice=dr.findElement(By.xpath("//div[@class='_1dqRvU']")).getText();
			
		System.out.println("New Price "+newprice);
		
		dr.close();
	}
	
}
