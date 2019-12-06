import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://en.wikipedia.org");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

        Actions actions = new Actions(driver);

        actions
                .moveToElement(searchInput)
                .click()
                .sendKeys("ASdsfdsfdfdsfsdfsd")
                .keyDown(searchInput, Keys.CONTROL)
                .sendKeys(searchInput, "a")
                .sendKeys(searchInput, "x")
                .sendKeys(searchInput, "v")
                .keyUp(searchInput, Keys.CONTROL)
                .sendKeys(searchInput, Keys.ENTER)
                .build()
                .perform();


    }
}
