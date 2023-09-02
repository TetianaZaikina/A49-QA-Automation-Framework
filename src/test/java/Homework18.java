import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{
    @Test
    public void PlaySong () throws InterruptedException {
        navigateToPage();
        provideEmail("pchelka240386@gmail.com");
        providePassword ("te$t$tudent");
        clickSubmit();
        Thread.sleep(3000);
        clickPlayNextBtn();
        checkSongIsPlaying();
    }

    public void navigateToPage() {
    }

    private void provideEmail(String email) {
        WebElement emailField=driver.findElement(By.cssSelector("[type='email']"));
        emailField.click();
        emailField.sendKeys(email);
    }
    private void providePassword(String password) {
        WebElement passwordField=driver.findElement(By.cssSelector("[type='password']"));
        passwordField.click();
        passwordField.sendKeys(password);
    }
    public void clickSubmit() {
    }
        private void clickPlayNextBtn() throws InterruptedException {
        WebElement playNextBtn= driver.findElement(By.cssSelector("[data-testid='play-next-btn']"));
        playNextBtn.click();
        WebElement playBtn= driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        playBtn.click();
        Thread.sleep(5000);
    }
    public void checkSongIsPlaying() {
        WebElement soundBar= driver.findElement(By.cssSelector("[data-testid='sound-bar-play']"));
        Assert.assertTrue(soundBar.isDisplayed());
    }
}
