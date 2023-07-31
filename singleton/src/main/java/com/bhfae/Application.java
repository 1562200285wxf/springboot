package com.bhfae;

import com.bhfae.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-28 17:07
 * @description：
 */
@SpringBootApplication
public class Application {
    @Autowired
    Test test;
    public static void main(String[] args) {
         SpringApplication.run(Application.class,args);
    }

    @PostConstruct
    public void tt(){
        test.test();
    }
}
