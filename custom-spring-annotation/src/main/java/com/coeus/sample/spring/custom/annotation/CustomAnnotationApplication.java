/**
 * @FileName: CustomAnnotationApplication.java
 * @Package: com.coeus.sample.spring.custom.annotation
 * @author liusq23
 * @created 2017/5/14 下午8:30
 * <p>
 * Copyright 2015 ziroom
 */
package com.coeus.sample.spring.custom.annotation;

import com.coeus.sample.spring.custom.annotation.definition.CustomService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
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
@SpringBootApplication
//@ComponentScan(includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = CustomService.class)
//        , @ComponentScan.Filter(type = FilterType.ANNOTATION, value = RestController.class)})
public class CustomAnnotationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CustomAnnotationApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CustomAnnotationApplication.class);
    }

}
