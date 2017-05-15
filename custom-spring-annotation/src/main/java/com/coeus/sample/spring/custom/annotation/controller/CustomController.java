/**
 * @FileName: CustomController.java
 * @Package: com.coeus.sample.spring.custom.annotation
 * @author liusq23
 * @created 2017/5/14 下午9:20
 * <p>
 * Copyright 2015 ziroom
 */
package com.coeus.sample.spring.custom.annotation.controller;

import com.coeus.sample.spring.custom.annotation.definition.CustomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author liusq23
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/hello")
public class CustomController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/{name}")
    public String hello(@PathVariable String name) {
        CustomBean service = applicationContext.getBean(CustomBean.class);
        return "hello " + service.toString() + "";
    }


}
