package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends base {

    @Test(dataProvider = "getData")

    public void basePageNavigation(String Username,String Password,String text) throws IOException {

        driver=initializeDriver();
        driver.get(prop.getProperty("url"));
        // one is inheritance
        // creating object to that class and invoke methods of it

        LandingPage I=new LandingPage(driver);
        I.getClose().click(); //driver.findElement(By.css())
        I.getLogin().click();

        LoginPage Ip=new LoginPage(driver);
        Ip.getEmail().sendKeys(Username);
        Ip.getPassword().sendKeys(Password);
        System.out.println(text);
        Ip.getLogin().click();


    }
    @AfterTest

    public void teardown(){

        driver.close();

    }

    @DataProvider

    public Object[][] getData() {
        //Row stands for how many different data types test should run
        //column stands for how many values per each test

        Object[][] data = new Object[2][3];
        //0th row
        data[0][0] = "nonrestricteduser@qw.com";
        data[0][1] = "123456";
        data [0][2]="Restricted User";
        //1st row
        data [1][0]="restricteduser@qw.com";
        data [1][1]="456788";
        data [1][2]="Non Restricted User";

        return data;



    }
}

