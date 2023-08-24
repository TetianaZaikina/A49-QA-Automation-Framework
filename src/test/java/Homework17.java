import org.openqa.selenium.By;

public class Homework17 {
    @Test (description= "Homework17 - addSongToPlaylist")
    public void addSongToPlaylist(){
        loginWithCorrectCreds();

        enterText(By.cssSelector("[type ='search']", "Reactor");
    }

    private void enterText(By inputLocator, String InputText) {
        WebElement searchInput= driver.findElement(inputLocator);
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(inputText);

    }
}
