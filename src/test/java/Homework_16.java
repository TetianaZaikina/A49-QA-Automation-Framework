import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_16  extends BaseTest {
    @Test
    public void Registration() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement RegistrationInput = driver.findElement(By.cssSelector("[href='registration']"));
        RegistrationInput.click();
        RegistrationInput.clear();
        RegistrationInput.sendKeys();

        WebElement EmailInput = driver.findElement(By.cssSelector("[type='email']"));
        RegistrationInput.click();
        RegistrationInput.clear();
        RegistrationInput.sendKeys("pchelka2403@yahoo.com");

        WebElement SubmitBtn = driver.findElement(By.cssSelector("[type='submit']"));
        SubmitBtn.click();

        WebElement RegistrationPage = driver.findElement(By.cssSelector("[href='registration']"));
        Assert.assertTrue(RegistrationPage.isDisplayed());
        driver.quit();









    }
}
