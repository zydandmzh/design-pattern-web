package com.mzh.study.portal;

import com.jd.fce.fragment.core.annotation.ExportMethod;
import com.jd.fce.fragment.core.annotation.ExportService;
import org.springframework.stereotype.Component;

/**
 * Created by mazhihui on 2020/3/3.
 */
@ExportService
@Component
public class FacadeDemo {
    @ExportMethod
    public String testFacade(String name){
        return "hello," + name ;
    }
}
