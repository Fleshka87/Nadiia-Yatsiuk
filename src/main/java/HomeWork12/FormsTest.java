package HomeWork12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormsTest {
    private static final String URL ="https://demoqa.com/automation-practice-form";
    WebDriver driver;

@BeforeTest
    public void driversetUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(URL);
}

//@AfterTest
//    public void quite(){
//    driver.quit();
//}

@Test
    public  void fillForms (){
    PageForms pageForms = new PageForms(driver);
    pageForms.setName("Nadiia");
    pageForms.setLastName("Ytsiuk");
    pageForms.setEmail("jklk@gmail.com");
    pageForms.setGender();
    pageForms.setPhone("0961367798");
    pageForms.setDate("12","April", "1900");
    pageForms.setSubject();
    pageForms.scroll();
    pageForms.setHobie();
    pageForms.setState();
    pageForms.setCity();
    pageForms.setPermAddress("515 kjkjjj");
    pageForms.choosePicture("C:\\Users\\yatsi\\Desktop\\ITEA\\pic.jpg");
    pageForms.scroll();
    pageForms.clickSubmit();

    Assert.assertTrue(driver.findElement(By.xpath("//*[@class='modal-content']")).isDisplayed(), "true");


}




}
