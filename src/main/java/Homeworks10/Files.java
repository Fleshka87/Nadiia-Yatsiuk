package Homeworks10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Files {


    public static void main(String[] args) {
        String URL = "https://demoqa.com/";
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("download.default_directory", Paths.get("target").toFile().getAbsolutePath());

        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);



    }

}