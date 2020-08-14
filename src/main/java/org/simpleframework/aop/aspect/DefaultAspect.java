package org.simpleframework.aop.aspect;

import java.lang.reflect.Method;

public abstract class DefaultAspect {
    /**
     * @param targetClass 被代理的目标类
     * @param method      被代理目标方法
     * @param args        被代理目标方法对应的参数列表
     * @throws Throwable
     */
    public void before(Class<?> targetClass, Method method, Object[] args) throws Throwable {
    }

    /**
     * @param targetClass 被代理的目标类
     * @param method      被代理目标方法
     * @param args        被代理目标方法对应的参数列表
     * @param returnValue 被代理的目标方法执行后的返回值
     * @return
     * @throws Throwable
     */
    public Object afterReturning(Class<?> targetClass, Method method, Object[] args, Object returnValue) throws Throwable {
        return returnValue;
    }

    /**
     * @param targetClass 被代理的目标类
     * @param method      被代理目标方法
     * @param args        被代理目标方法对应的参数列表
     * @param e           被代理的目标方法抛出的异常
     * @throws Throwable
     */
    public void afterThrowing(Class<?> targetClass, Method method, Object[] args, Throwable e) throws Throwable {
    }

}
