package com.mzh.study.facade;

import com.mzh.study.facade.facades.ComputerFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by mazhihui on 2020/3/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class FacadeDisplay {
    @Autowired
    private ComputerFacade computerFacade;
    @Test
    public void test() {

        computerFacade.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        computerFacade.stop();
    }
}
