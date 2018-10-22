package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger lo gger = LoggerFactory.getLogger(LoggerTest2.class);

    @Test
    public void test1() {
        String name = "imooc";
        String pwd = "123";
        log.debug("debug...");
        log.info("info...name:{},pwd:{}", name, pwd);
        log.error("error...");
        log.warn("warn...");
    }
}
