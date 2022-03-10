package Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

import java.io.IOException;


public class validateNavigationBar extends base {

    @BeforeTest
 public void initialize () throws IOException {

        driver=initializeDriver();
        driver.get(prop.getProperty("url"));
    }
        @Test
        public void basePageNavigation() throws IOException {


            //one is inheritance
            //creating object to that class and invoke methods of it

            LandingPage La=new LandingPage(driver);
            Assert.assertEquals(La.getTitle().getText(),"FEATURED COURSES");
            //compare the text from the browser with actual text. -Error..
            Assert.assertTrue(La.getNavigationBar().isDisplayed());


        }

        @AfterTest

        public void teardown(){

        driver.close();

        }
    }

