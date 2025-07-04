package com.thirumal;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


@SpringBootTest
@ActiveProfiles("dev")
public class FirstTest {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstTest.class);

    @Autowired
    private WebDriver driver;

    @Autowired
    private String baseUrl;

    @BeforeMethod
    public void setup() {
    }

    @Test
    void loginTest() {
    	logger.debug("Loading URL : {}", baseUrl);
        driver.get(baseUrl);
        logger.debug("URL is loaded");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        logger.debug("Test is complete, closing the browser...");
    }
}

