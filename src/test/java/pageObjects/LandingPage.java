package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By close=By.xpath("//button[normalize-space()='NO THANKS']");

    By signin=By.cssSelector("a[href*='sign_in']");

    By title=By.cssSelector(".text-center>h2");

    By naviBar=By.cssSelector("header li:nth-child(8) a:nth-child(1)");
    public LandingPage(WebDriver driver) {

        this.driver=driver;
    }

    public WebElement getClose()
    {
        return driver.findElement(close);
    }

    public WebElement getLogin()
    {
        return driver.findElement(signin);
    }

    public WebElement getTitle()
    {
        return driver.findElement(title);
    }

    public WebElement getNavigationBar()
    {
        return driver.findElement(naviBar);
    }
}
