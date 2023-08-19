import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase extends Parameters {
	String[] MyWebSiteLanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
	Random rand = new Random();

//	@Test(invocationCount = 5)
//
//	public void Check_The_WebSiteLanguage_And_CoinSAR_And_LogoPay_Found() {
//		
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  
//		  driver.get(MyWebSiteLanguage[rand.nextInt(0, MyWebSiteLanguage.length)]);
//		  String ActualTitle = driver.getTitle(); String ActualCoin = driver
//		  .findElement(By.xpath(
//		  "//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).
//		  getText(); String Expectlogo =
//		  "https://tjwlcdn.com/next/images/apple-pay.svg"; String ActualLogo = driver
//		  .findElement(By.xpath(
//		  "//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]/img"))
//		  .getAttribute("src");
//		  
//		  if (rand.nextInt(0, MyWebSiteLanguage.length) == 1) {
//		  myAssertion.assertEquals(ActualTitle,
//					"المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
//		  myAssertion.assertEquals(ActualCoin, "SAR");
//		  myAssertion.assertEquals(ActualLogo, Expectlogo); System.out.
//		  println("the website is English and the coin is SAR and found the logo");
//		  
//		  } else { myAssertion.assertEquals(ActualTitle,
//		  "Almosafer: Flights, Hotels, Activities & Airlines Ticket Bookin");
//		  myAssertion.assertEquals(ActualCoin, "SAR");
//		  myAssertion.assertEquals(ActualLogo, Expectlogo);
//		  
//		  System.out.
//		  println("the website is English and the coin is SAR and found the logo");
//		  
//		  }
//		  
//		  myAssertion.assertAll();
//		 
//}

//	@Test()
//
//	public void hotel_tab_is_not_selected() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		WebElement GetTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
//		boolean ActualResult = GetTab.isSelected();
//		myAssertion.assertEquals(ActualResult, false);
//		myAssertion.assertAll();
//
//	}

//	@Test(invocationCount = 10)
//	public void location_field() {
//		String[] MyWebSiteLanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//		Random rand = new Random();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		int RandomLanguageWebsite = rand.nextInt(MyWebSiteLanguage.length);
//		driver.get(MyWebSiteLanguage[RandomLanguageWebsite]);
//		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
//		String ArabCities[] = { "دبي", "جدة", "الرياض" };
//		String EnglishCities[] = { "Dubai", "Jeddah", "Riyadh" };
//		int RandomAr = rand.nextInt(ArabCities.length);
//		int RandomEn = rand.nextInt(EnglishCities.length);
//		if (RandomLanguageWebsite == 0) {
//			WebElement LocationFieldEn = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div[1]/div/div/input"));
//
//			LocationFieldEn.sendKeys(EnglishCities[RandomEn]);
//
//			LocationFieldEn.clear();
//
//		} else {
//
//			WebElement LocationFieldAr = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div[1]/div/div/input"));
//
//			LocationFieldAr.sendKeys(ArabCities[RandomAr]);
//
//			LocationFieldAr.clear();
//
//		}
//
//	}
	@Test(invocationCount = 5)
	public void Randomly_select_number_of_visitor() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Random rand2 = new Random();
		int myRandom = rand2.nextInt(2);
		driver.get("https://www.almosafer.com/en");
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
		WebElement RoomSelection = driver.findElement(By.xpath("//select[@class='tln3e3-1 eFsRGb']"));
		Select myselector = new Select(RoomSelection);
		myselector.selectByIndex(myRandom);

	}
}
