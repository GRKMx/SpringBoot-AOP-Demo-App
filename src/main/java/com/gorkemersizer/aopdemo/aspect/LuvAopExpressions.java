package com.gorkemersizer.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* com.gorkemersizer.aopdemo.dao.*.*(..))")
    public void forDAOPackage() {}

    @Pointcut("execution(* com.gorkemersizer.aopdemo.dao.*.get*(..))")
    public void getter() {}

    @Pointcut("execution(* com.gorkemersizer.aopdemo.dao.*.set*(..))")
    public void setter() {}

    @Pointcut("forDAOPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
