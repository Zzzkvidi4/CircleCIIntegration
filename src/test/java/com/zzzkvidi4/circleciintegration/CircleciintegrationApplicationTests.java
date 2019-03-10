package com.zzzkvidi4.circleciintegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CircleciintegrationApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void failingTest() {
        assertEquals(2, 4);
    }

}
