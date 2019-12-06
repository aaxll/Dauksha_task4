import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MainTables {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.w3schools.com/html/html_tables.asp");

        ArrayList<String> headersList = new ArrayList<String>();

        List<WebElement> headers = driver.findElements(By.xpath(".//*[@id=\"customers\"]/tbody/tr/th"));
        for (int i=0; i<headers.size();i++){
            headersList.add(headers.get(i).getText());
            //System.out.println(headers.get(i).getText());
        }
        System.out.println(headersList);

        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id=\"customers\"]/tbody/tr/td[1]"));
        System.out.println("Количество строк: " + rows.size());

        WebElement cell2x3 = driver.findElement(By.xpath(".//*[@id=\"customers\"]/tbody/tr[3]/td[3]"));
        System.out.println("(2, 3): " + cell2x3.getText());

        WebElement cell4x1 = driver.findElement(By.xpath(".//*[@id=\"customers\"]/tbody/tr[5]/td[1]"));
        System.out.println("(4, 1): " + cell4x1.getText());



        WebElement company4 = driver.findElement(By.xpath(".//*[@id=\"customers\"]/tbody/tr[5]/td["+(headersList.indexOf("Company")+1)+"]"));
        System.out.println("4, Company: " + company4.getText());

        WebElement country1 = driver.findElement(By.xpath(".//*[@id=\"customers\"]/tbody/tr[2]/td["+(headersList.indexOf("Country")+1)+"]"));
        System.out.println("1, Country: " + country1.getText());

        WebElement contact2 = driver.findElement(By.xpath(".//*[@id=\"customers\"]/tbody/tr[3]/td["+(headersList.indexOf("Contact")+1)+"]"));
        System.out.println("2, Contact: " + contact2.getText());


        driver.quit();
    }

}
