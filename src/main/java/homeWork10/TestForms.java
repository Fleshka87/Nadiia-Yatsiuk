package homeWork10;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;


public class TestForms {

    WebDriver driver;
    private static final String URL = "https://demoqa.com/";

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("download.default_directory", Paths.get("target").toFile().getAbsolutePath());
        prefs.put("profile.default_content_settings.popups", 0);


        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

//    @Test
//    public void testForms() throws InterruptedException {
//        driver.get(URL);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        driver.findElement(By.xpath("//div[@class='card-body']/h5[contains(text(),'Forms')]")).click();
//        driver.findElement(By.xpath("//*[contains(text(),'Pra')]")).click();
//        driver.findElement(By.id("firstName")).sendKeys("Nadiia");
//        driver.findElement(By.id("lastName")).sendKeys("Yatsiuk");
//        driver.findElement(By.id("userEmail")).sendKeys("Nadiia@gmail.com");
//        driver.findElement(By.className("custom-radio")).click();
//        driver.findElement(By.id("userNumber")).sendKeys("0961367798");
//        WebElement element= driver.findElement(By.id("dateOfBirthInput"));
//        //JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].value='12.12.2021';", element);
//
//        //я не написала ваш метод для встановлення дати, бо зовсім його не розумію
//
//        WebElement subject = driver.findElement(By.id("subjectsInput"));
//        subject.sendKeys("Chemistry");
//        subject.sendKeys(Keys.ENTER);
//        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        driver.findElement(By.xpath("//*[@class ='custom-control-label'][contains(text(), 'Sports')]")).click();
//       WebElement upload = driver.findElement(By.id("uploadPicture"));
//       upload.sendKeys("C:\\Users\\yatsi\\Desktop\\ITEA\\pic.jpg");
//       jse.executeScript("document.getElementById('state').innerHTML = 'NCR'");
//       jse.executeScript("document.getElementById('city').innerHTML = 'Delhi'");
//       driver. findElement(By.id("currentAddress")).sendKeys("516 str");
//       Thread.sleep(200);
//       driver.findElement(By.id("submit")).click();
//       Thread.sleep(200);
//       Assert.assertEquals(driver.findElement(By.xpath("//*[@class='modal-content']")).isDisplayed(), "true");



@Test
    public void checkbox (){
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("//*[contains(@class, 'rct-collapse rct-collapse-btn')]")).click();
        driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']/ol/li[3]//*[contains(@type, 'button')]")).click();

        WebElement wordFile = driver.findElement(By.xpath("//*[@for='tree-node-wordFile']//*[@class='rct-checkbox']"));

       WebElement exelFile = driver.findElement(By.xpath("//*[@class='rct-title'][contains(text(), 'Excel')]"));
       Assert.assertEquals(wordFile.isSelected(),false);
       Assert.assertEquals(exelFile.isSelected(),false);


       wordFile.click();
       exelFile.click();

       Assert.assertEquals(wordFile.isSelected(), true);
      // Assert.assertEquals(exelFile.isSelected(), true);

       WebElement downloads = driver.findElement(By.xpath("//span[contains(text(), 'down')]"));
       Assert.assertTrue(downloads.getText().contains("downloads"));





    }






    }

