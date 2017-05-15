/**
 * @FileName: HttpCacheSampleController.java
 * @Package: com.coeus.sample.controller
 * @author liusq23
 * @created 2017/5/7 下午7:20
 * <p>
 * Copyright 2015 coeus
 */
package com.coeus.sample.http.cache.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

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
@RequestMapping("/http")
public class HttpCacheSampleController {

    /**
     * 缓存协商
     * @param modifiedSince
     * @param response
     * @return
     */
    @RequestMapping("/cache")
    public ResponseEntity cache(@RequestHeader(value = "If-Modified-Since", required = false) Date modifiedSince, HttpServletResponse response) {
        //缓存1天
        long nowTime = new Date().getTime();
        if(modifiedSince!=null) {
            long expireTime = modifiedSince.getTime() + 24 * 3600 * 1000;
            //未过期
            if (nowTime<expireTime) {
                return new ResponseEntity("cached", HttpStatus.NOT_MODIFIED);
            }
        }
        //告知浏览器最后一次更新时间
        response.setDateHeader("Last-Modified", nowTime);
        return new ResponseEntity("not cache", HttpStatus.OK);
    }

    /**
     * 消灭请求
     * @param modifiedSince
     * @param response
     * @return
     */
    @RequestMapping("/expires")
    public ResponseEntity expires(@RequestHeader(value = "If-Modified-Since", required = false) Date modifiedSince, HttpServletResponse response) {
        //缓存1天
        long nowTime = new Date().getTime();
        long expireTime;
        if(modifiedSince!=null) {
            expireTime = modifiedSince.getTime() + 24 * 3600 * 1000;
            //未过期
            if (nowTime<expireTime) {
                return new ResponseEntity("Expires 304", HttpStatus.NOT_MODIFIED);
            }
        }
        expireTime = nowTime + 24 * 3600 * 1000;
        response.setDateHeader("Last-Modified", nowTime);
        //告知浏览器缓存时间点
        response.setDateHeader("Expires",expireTime);
        return new ResponseEntity("Expires 200", HttpStatus.OK);
    }

}
