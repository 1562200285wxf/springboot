package com.bhfae.service.impl;

import com.bhfae.service.Test;
import org.springframework.stereotype.Service;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-28 17:12
 * @description：
 */
@Service
public class TestImpl implements Test {
    @Override
    public void test() {
        System.out.println("Test");
    }
}
