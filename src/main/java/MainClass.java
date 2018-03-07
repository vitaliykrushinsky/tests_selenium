import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vitaliy\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 1000));

//        driver.get("https://www.seleniumhq.org/download/");
//        driver.navigate().to("https://google.com");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());


//        driver.get("https://uk.wikipedia.org/");
//        WebElement link = driver.findElement(By.linkText("Увійти"));
//        WebElement link2 = driver.findElement(By.partialLinkText("Статистика"));
//        WebElement searchField = driver.findElement(By.name("search"));
//        WebElement searchButton =  driver.findElement(By.className("searchButton"));
//        WebElement simpleSearch = driver.findElement(By.id("simpleSearch"));
//        WebElement form = driver.findElement(By.tagName("form"));
//        WebElement cssLocator = driver.findElement(By.cssSelector("#simpleSearch"));
//        WebElement logo = driver.findElement(By.xpath("//*[@id=\"p-logo\"]/a"));

//
//        driver.get("https://jobs.dou.ua");
//        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/input"));
//        System.out.println(searchButton.getText());
//        searchButton.click();


//        driver.get("https://en.wikipedia.org");
//        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchButton\"]"));
//        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium WebDriver");
//        searchButton.click();
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).getAttribute("value"));
//        driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).clear();


//        driver.get("https://en.wikipedia.org");
//        WebElement aboutWikipedia = driver.findElement(By.xpath("//*[@id=\"n-aboutsite\"]/a"));
//        System.out.println(aboutWikipedia.getText());
//        aboutWikipedia.click();


//        driver.get("https://hotline.ua/mobile/mobilnye-telefony-i-smartfony/");
//        WebElement smartphones = driver.findElement(By.xpath("//*[@id=\"page-catalog\"]/div[1]/div[1]/div[1]/aside/div/div[3]/div[1]/div[3]/div[2]/ul/li[1]/label"));
//        smartphones.click();
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"page-catalog\"]/div[1]/div[1]/div[1]/aside/div/div[3]/div[1]/div[3]/div[2]/ul/li[1]/label/input")).isSelected());


        driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en");
        driver.findElement(By.xpath("(//strong[text()=\"Пол\"]/following-sibling::div/div[@role=\"listbox\"])[1]")).click();


//        driver.quit();
    }
    static void isSelected(String path) {
        if (driver.findElement(By.xpath(path)).isSelected()) {
            driver.findElement(By.xpath(path)).click();
        }
    }
}
