package com.pngyul.springboot.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Copyright (c) 2019
 * @Author:pngyul@yeah.net
 * @LastModified:2019-03-28 18:38:05
 */

public class LoginHandlerInterceptor implements HandlerInterceptor {

    //调用目标方法之前被拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if( loginUser != null) {
            //已经登录过,放行
            return true;
        }
        //没有登录过
        request.setAttribute("msg", "没有权限，请先登录！");
        request.getRequestDispatcher("/index.html").forward(request, response);
        return false;
    }
}
