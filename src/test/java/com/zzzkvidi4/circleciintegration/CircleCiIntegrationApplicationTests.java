package com.zzzkvidi4.circleciintegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CircleCiIntegrationApplicationTests {

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void failingTest() {
        throw new NullPointerException("Some msg");
    }

}
