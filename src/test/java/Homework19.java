import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Homework19 extends BaseTest {
    public void deletePlaylist(){
     navigateToPage();
     provideEmail("pchelka240386@gmil.com");
     providePassword("te$t$tudent");
     clickSubmit();
     clickOnPlaylist();
     clickOnDeletePlaylistBtn();
     clickShowSuccess();
     checkShowSuccess();
     clickOnOk();

     
     
     
     
    }

    private void clickOnOk() {
        WebElement okBtn = driver.findElement (By.cssSelector(".ok"));
        okBtn.click();
    }

    private void checkShowSuccess() {
    }

    private void clickShowSuccess() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertTrue(notificationIsDisplayed());

    }

    private void clickOnDeletePlaylistBtn() {
        WebElement deletePlaylistBtn = driver.findElement(By.cssSelector(".del.btn-delete-playlist"));
        deletePlaylistBtn.click();
    }

    private void click() {
    }

    private void clickOnPlaylist() {
        WebElement playlist = driver.findElement(By.cssSelector("[href='#!/playlist/69325']"));
        playlist.click();
    }

    private void clickSubmit() {
    }

    private void providePassword(String password) {
    }

    private void provideEmail(String email) {
    }

    private void navigateToPage() {
    }
}
