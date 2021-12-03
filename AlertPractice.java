package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPractice {
    @Test
    public void Test1() {

        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPrompt.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Techtorial");
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        String actual = result.getText().trim();
        Assert.assertEquals(actual, "You entered: Techtorial");

    }
}
