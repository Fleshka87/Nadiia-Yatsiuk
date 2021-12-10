package HomeWork12Update;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PageForms {
    WebDriver driver;
    By inputName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By inputEmail = By.id("userEmail");
    By inputGender = By.className("custom-radio");
    By inputPhoneNumber = By.id("userNumber");
    By inputSubject = By.id("subjectsInput");
    By inputDateOfBirth = By.id("dateOfBirthInput");
    By chooseFile = By.id("uploadPicture");
    By inputHobie = By.xpath("//*[contains(@class, 'custom-control custom-checkbox custom-control-inline')][1]");
    By inputPermAddress = By.id("currentAddress");
    By submitBtn = By.id("submit");
    By submisionPage= By.xpath("//*[@class='modal-content']");




    public PageForms(WebDriver driver) {
        this.driver = driver;
    }

    public void setName (String name){
        driver.findElement(inputName).sendKeys(name);
    }
    public void setLastName (String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }
    public void setEmail (String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setGender (){
        driver.findElement(inputGender).click();
    }
    public void setPhone (String phone){
        driver.findElement(inputPhoneNumber).sendKeys(phone);
    }
    public void setSubject (){
        driver.findElement(inputSubject).sendKeys("Chemistry");
        driver.findElement(inputSubject).sendKeys(Keys.ENTER);
    }

    public void setDate(String day, String month, String year)
    {
        driver. findElement(inputDateOfBirth).click();
        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByVisibleText(month);
        selectMonth.selectByVisibleText(month);
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByVisibleText(year);
        WebElement dayElement = driver.findElement(By.xpath("//*[contains(@class, '--0"+ day+"')]"));
        dayElement.click();

    }
    public void setHobie(){
        driver.findElement(inputHobie).click();

    }
     public void setState(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('state').innerHTML = 'NCR'");
     }

    public void setCity(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('city').innerHTML = 'Delhi'");
    }

    public void choosePicture (String location) {
        driver.findElement(chooseFile).sendKeys(location);
    }

    public void setPermAddress (String address){
        driver.findElement(inputPermAddress).sendKeys(address);

    }
    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }

    public void scroll(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

}
