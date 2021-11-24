package HomeWork9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Selemium {

    WebDriver driver;
    private static final String URL = "https://demoqa.com/";
    List<String> expectedName = new ArrayList<String>();
    List<String> actualName = new ArrayList<String>();


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

  //  @Test
//    public void firstTest() throws InterruptedException {
//        driver.get(URL);
//        System.out.println(driver.getCurrentUrl());
//        String url = driver.getWindowHandle();
//        WebElement joinButton = driver.findElement(By.xpath("//*[@class='home-banner']"));
//        joinButton.click();
//        driver.getCurrentUrl();
//        String url2 = driver.getWindowHandle();
//        List<String>urlList= new ArrayList<String>();
//        urlList.add(url);
//        urlList.add(url2);
//        Assert.assertEquals(urlList.size(), 2);


   // }


//    @Test
//    public void compareText() throws InterruptedException
//    {
//        driver.get(URL);
//        WebElement Elements = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));
//        String elements = Elements.getText();
//        WebElement Forms = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Forms')]"));
//        String forms = Forms.getText();
//        WebElement Alerts = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Alerts')]"));
//        String alerts = Alerts.getText();
//        WebElement Widgets = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Widgets')]"));
//        String widgets = Widgets.getText();
//        WebElement Interactions = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Interactions')]"));
//        String interactions = Interactions.getText();
//
//        expectedName.add("Elements");
//        expectedName.add("Forms");
//        expectedName.add("Alerts, Frame & Windows");
//        expectedName.add("Widgets");
//        expectedName.add("Interactions");
//
//        actualName.add(elements);
//        actualName.add(forms);
//        actualName.add(alerts);
//        actualName.add(widgets);
//        actualName.add(interactions);
//
//        for(int x=0; x<expectedName.size();x++){
//            if(expectedName.get(x).equals(actualName.get(x))){
//                System.out.println("matched");
//            }
//            else {
//                System.out.println("not matched");
//            }
//
//        }
//
//   }


   @Test
    public void textBox()
    {
       driver.get(URL);
       WebElement cardElements = driver.findElement(By.xpath("//*[contains(h5,'Elements')]"));
       cardElements.click();
       WebElement textBoxx = driver.findElement(By.xpath("//*[@class = 'btn btn-light '][@id = 'item-0']"));
       textBoxx.click();
       driver.findElement(By.xpath("//*[@class= 'col-md-9 col-sm-12']/input[id='userName']")).sendKeys("Nadiia");
       driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/input[@id = 'userEmail']")).sendKeys("Nadiia@email.com");
       driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/textarea[@id ='currentAddress']")).sendKeys("516 str");
       driver.findElement(By.xpath("//*[@class= 'col-md-9 col-sm-12']/textarea[@id='permanentAddress']")).sendKeys("516 str");
       WebElement submit = driver.findElement(By.xpath("//button[contains(@id, 'submit')]"));
       submit.click();


       List<String>webList= new ArrayList<String>();
       webList.add(driver.findElement(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12')]/p[contains(@id, 'name')]")).getText());
       webList.add(driver.findElement(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12')]/p[contains(@id, 'email')]")).getText());
       webList.add(driver.findElement(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12')]/p[contains(@id, 'currentAddress')]")).getText());
       webList.add(driver.findElement(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12')]/p[contains(@id, 'permanentAddress')]")).getText());

       Map<String, String> map = new HashMap<>();
       for (String s:webList){
           String[] value = s.split(":");
           map.put(value[0], value[1]);
           System.out.println(map);
       }
       Assert.assertEquals(map.containsValue("Nadiia"), true);
       Assert.assertEquals(map.containsValue("Nadiia@email.com"), true);
       Assert.assertEquals(map.containsValue("516 str"), true);
       Assert.assertEquals(map.containsValue("516 str"), true);
















       }
//
//
    }







//        @AfterTest
//                public void stopRun(){
//            driver.quit();
//        }




