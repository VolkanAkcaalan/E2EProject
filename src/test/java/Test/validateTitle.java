package Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

import java.io.IOException;


public class validateTitle extends base {


    @Test
    public void basePageNavigation() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        //one is inheritance
        //creating object to that class and invoke methods of it

        LandingPage La = new LandingPage(driver);
        Assert.assertEquals(La.getTitle().getText(), "FEATURED COURSES");
    }

    @AfterTest

    public void teardown(){

        driver.close();

    }
}