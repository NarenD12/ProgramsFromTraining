package com.infinite.springAop.AOPExample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdviceClass {
//	
//	@Pointcut("execution(* com.infinite.springAop.*.*(..))")
//	private void All(){
//	}

	@Before("All()")
	public void beforeAdvice(){
	     System.out.println("Before advice executed.");
	}
	@After("All()")
	public void afterAdvice(){
	    System.out.println("After advice executed.");
	}
}
