package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isEnabled_isSelected_isDisplayed {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/202422515857050");
        driver.manage().window().maximize();

        //AD SOYAD
        driver.findElement(By.xpath("//input[@id='first_6']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@id='last_6']")).sendKeys("Türkmen");

        //EPOSTA
        driver.findElement(By.xpath("//input[@id='input_12']")).sendKeys("brk@brk.com");

        //isEnabled YAŞ KUTUSU KONTROL
        WebElement yas = driver.findElement(By.xpath("//input[@name='q10_kacYasindasiniz']"));

        if (yas.isEnabled()){
            System.out.println("YAŞ KUTUSU MEVCUTTUR.\n");
        }

        //YAŞ
        driver.findElement(By.xpath("//input[@name='q10_kacYasindasiniz']")).sendKeys("23");

        //HOBİ
        Select hobi = new Select(driver.findElement(By.xpath("//select[@id='input_11']")));
        hobi.selectByValue("Resim çizmek");

        Thread.sleep(2000);

        //KAÇ SAAT DERS
        driver.findElement(By.xpath("//input[@id='input_14_3']")).click();

        Thread.sleep(2000);

        WebElement kacSaatDers = driver.findElement(By.xpath("//input[@id='input_14_3']"));

        if (kacSaatDers.isSelected()){
            System.out.println("Kaç saat ders çalıştığı seçildi.\n");
        }

        //SEBEP
        driver.findElement(By.xpath("//input[@id='input_16_3']")).click();

        //10 ÜZERİNDEN PUAN
        driver.findElement(By.xpath("//input[@id='1599146075783-number']")).sendKeys("10");

        Thread.sleep(2000);

        //button
        driver.findElement(By.xpath("//button[@id='input_2']")).click();

        //TEŞEKKÜR YAZISI
        WebElement tesekkur = driver.findElement(By.xpath("//h1[text()='Teşekkürler!']"));

        if (tesekkur.isDisplayed()){
            System.out.println("TEŞEKKÜR YAZISI GÖRÜNDÜ");
        }

    }
}
