package Week4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eu.jotform.com/form/202613856967365#preview");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_TAB);

        //Isim
        robot.keyPress(KeyEvent.VK_B);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_U);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_K);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_U);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_K);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(500);

        //Kıyafet
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);

        //Tshirt
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //Sweatshirt
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //saat
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_1);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_0);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_2);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_6);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //Send Gift
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(500);

        js.executeScript("window.scrollBy(0,450)", "");

        //Mentoring
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);

        //Dosya yükleme
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_ENTER);




























    }
}
