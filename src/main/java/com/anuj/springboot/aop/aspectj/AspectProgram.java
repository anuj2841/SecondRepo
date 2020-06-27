package com.anuj.springboot.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectProgram {
	
	@Before(value = "execution(* setName(..)) and args(name)")
	public void beforeAdvice(JoinPoint joinPoint,String name) {
		System.out.println(" before advice executed name:"+name+"joinPoint:"+joinPoint);
	}
	
	@After(value = "execution(* setName(..)) and args(name)")
	public void afterAdvice(JoinPoint joinPoint,String name) {
		System.out.println(" After advice executed name:"+name);
	}
	
	@Around(value = "execution(* setAge(..)) and args(age)")
	public void arroundAdvice(ProceedingJoinPoint procedingJointPoint,String age) throws Throwable {
		System.out.println("Arround advice getting exceited before method invocation age:"+age);
		procedingJointPoint.proceed();
		System.out.println("Arround advice getting exceuted after method invocaton");
	}
	
	@Before(value = "allGetter()")
	public void berforeGetterAdvice() {
		System.out.println("Inside getter advice");
	}
	
	@Pointcut(value = "execution(* setName(..))")
	public void allGetter() {
		
	}
}
