/**
 * @FileName: HelloController.java
 * @Package: com.coeus.sample.spring.custom.annotation.controller
 * @author liusq23
 * @created 2017/5/15 下午4:00
 * <p>
 * Copyright 2015 ziroom
 */
package com.coeus.sample.spring.custom.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 */
@Controller
@RequestMapping("/hi")
public class HelloController {

    @RequestMapping("/s")
    public String hello(){
        return "hello";
    }

}
