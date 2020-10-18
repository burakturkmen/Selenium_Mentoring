package Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class IT_Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/202543889228363");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //AD SOYAD
        driver.findElement(By.xpath("//input[@id='first_3']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@id='last_3']")).sendKeys("Türkmen");

        //ŞİRKET
        driver.findElement(By.xpath("//input[@id='input_4']")).sendKeys("Techno Study");

        //ADRES
        driver.findElement(By.xpath("//input[@id='input_12_addr_line1']")).sendKeys("Langberg Street.");
        driver.findElement(By.xpath("//input[@id='input_12_addr_line2']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@id='input_12_city']")).sendKeys("Frankfurt");
        driver.findElement(By.xpath("//input[@id='input_12_state']")).sendKeys("Hessen");
        driver.findElement(By.xpath("//input[@id='input_12_postal']")).sendKeys("60306");

        Select country = new Select(driver.findElement(By.xpath("//select[@id='input_12_country']")));
        country.selectByValue("Germany");

        //Telefon Numarası
        driver.findElement(By.xpath("//input[@id='input_13_area']")).sendKeys("+49");
        driver.findElement(By.xpath("//input[@id='input_13_phone']")).sendKeys("12334512");

        //email
        WebDriverWait mailWait = new WebDriverWait(driver, 10);
        WebElement email = mailWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input_6']")));
        email.sendKeys("Brk@brk.com");

        //scroll down
        js.executeScript("window.scrollBy(0,450)", "");

        //Problem Katagori
        driver.findElement(By.xpath("//input[@id='input_7_1']")).click();

        //Problem yazısı
        driver.findElement(By.xpath("//textarea[@id='input_16']")).sendKeys("Internetim 150 mgbit olmasına rağmen geceleri 10 mgbit'in altına düşünüyor.");

        //Soru yorum
        driver.findElement(By.xpath("//textarea[@id='input_9']")).sendKeys("Sorunum acilen çözülmesi lazım. Cevabınızı bana mail atın lütfen.");

        //Saat
        Select saat = new Select(driver.findElement(By.xpath("//select[@id='input_18_hourSelect']")));
        saat.selectByValue("10");

        Select dakika = new Select(driver.findElement(By.xpath("//select[@id='input_18_minuteSelect']")));
        dakika.selectByValue("30");

        Select AmPm = new Select(driver.findElement(By.xpath("//select[@id='input_18_ampm']")));
        AmPm.selectByValue("AM");

        //Gönder
        WebDriverWait gonderWait = new WebDriverWait(driver, 20);
        WebElement gonder = gonderWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='input_17']")));

        driver.quit();

    }
}
