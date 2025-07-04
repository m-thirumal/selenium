package com.thirumal;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


@SpringBootTest
@ActiveProfiles("dev")
public class FirstTest {

    @Autowired
    private WebDriver driver;

    @Autowired
    private String baseUrl;

    @BeforeMethod
    public void setup() {
    }

    @Test
    public void loginTest() {
        System.out.println("Loading URL : " + baseUrl);
        driver.get(baseUrl);
        System.out.println("hello");
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            //
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

