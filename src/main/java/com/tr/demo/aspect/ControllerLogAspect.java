package com.tr.demo.aspect;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class ControllerLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(ControllerLogAspect.class);

    @Pointcut("execution(* com.tr.demo.controller.*.*(..))")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        logReqController(getRequest());
        Object object = point.proceed();
        logResController(getRequest(), object);
        return object;
    }

    /**
     * 获得请求
     *
     * @return
     */
    private HttpServletRequest getRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        return sra.getRequest();
    }

    /**
     * 请求前置日志
     *
     * @param request
     */
    private void logReqController(HttpServletRequest request) {
        if (logger.isInfoEnabled()) {
            String url = request.getRequestURL().toString();
            String method = request.getMethod();
            String params = JSONObject.toJSONString(request.getParameterMap());
            String remoteAddr = request.getRemoteAddr();
            logger.info("接到服务请求,开始处理。url: {}, method: {}, params: [{}] remoteAddr: {}", url, method, params, remoteAddr);
        }
    }

    /**
     * 请求后置日志
     *
     * @param request
     * @param result
     */
    private void logResController(HttpServletRequest request, Object result) {
        if (logger.isInfoEnabled()) {
            String url = request.getRequestURL().toString();
            String remoteAddr = request.getRemoteAddr();
            logger.info("服务请求处理完成，url: {}, remoteAddr: {}", url, remoteAddr);
        }
        if (logger.isDebugEnabled()) {
            logger.debug("响应结果: {}", JSONObject.toJSONString(result));
        }
    }
}
