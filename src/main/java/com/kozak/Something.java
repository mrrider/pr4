package com.kozak;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Something{
	
	@Pointcut("execution(* com.kozak.Car.drive(..))")
	public void doSomething(){}
	
	@Before("doSomething()")
	public void doBefore() {
		System.out.println("Do something before....");
	};
	@AfterReturning("doSomething()")
	public void doAfter() {
		System.out.println("Do something after....");
	};
	@AfterThrowing("doSomething()")
	public void doing() {
		System.out.println("Doing....");
	};
}
