/**
 * @FileName: CustomBean.java
 * @Package: com.coeus.sample.spring.custom.annotation
 * @author liusq23
 * @created 2017/5/14 下午10:26
 * <p>
 * Copyright 2015 ziroom
 */
package com.coeus.sample.spring.custom.annotation.definition;

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
@CustomService(timeout = 1000)
public class CustomBean {

    private Integer timeout;

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
