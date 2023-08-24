import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{
    @Test()
    public void PlaySong () throws InterruptedException {
        navigateToPage();
        provideEmail("pchelka240386@gmail.com");
        providePassword ("te$t$tudent");
        clickSubmit();
        Thread.sleep(3000);
        clickPlayNextBtn();
        checkSongIsPlaying();
    }

    private void clickSubmit() {
    }

    private void providePassword(String te$t$tudent) {
    }

    private void provideEmail(String "pchelka240386@gmail.com"String mail) {
    }

    private void navigateToPage() {
    }

    private void checkSongIsPlaying() {
        WebElement soundBar= driver.findElement(By.cssSelector("[data-testid='sound-bar-play']"));
        Assert.assertTrue(soundBar.isDisplayed());
    }

    private void clickPlayNextBtn() throws InterruptedException {
        WebElement playNextBtn= driver.findElement(By.cssSelector("[data-testid='play-next-btn']"));
        playNextBtn.click();
        WebElement playBtn= driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        playBtn.click();
        Thread.sleep(5000);
    }
}
