/**
 * @FileName: CustomService.java
 * @Package: com.coeus.sample.spring.custom.annotation
 * @author liusq23
 * @created 2017/5/14 下午9:05
 * <p>
 * Copyright 2015 ziroom
 */
package com.coeus.sample.spring.custom.annotation.definition;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

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
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CustomService {

    String value() default "";

    int timeout();
}
