package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author squareface
 * @Description //测试日志
 * @Date 17:29 2019-03-26
 * @Param
 * @return 
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {



    @Test
    public void test1(){

        log.warn("waring...");
        log.debug("debug.....");
        log.info("info.....");
        log.error("error....");


    }
}
