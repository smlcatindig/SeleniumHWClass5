package HWclass05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it
Note: don't worry if the text u send doesn't appear up in the textBox
 */
public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(2000);

        Alert confirmationAlert3=driver.switchTo().alert();
        confirmationAlert3.sendKeys("selenium");
        Thread.sleep(2000);
        confirmationAlert3.accept();
        driver.quit();





    }
}
