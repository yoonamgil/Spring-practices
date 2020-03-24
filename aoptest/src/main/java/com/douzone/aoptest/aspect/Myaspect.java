package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Myaspect {
	
	@Before("execution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find(String))") // 정규 경로
	public void beforeAdvice() {
		System.out.println("---- befoer Advice ----");
	}
	
	
	@After("execution(*  *..*.service.ProductService.*(..))") // 경로의 간략화 
	public void afterAdvice() {
		System.out.println("---- after  Advice ----");
	}

	
	@AfterReturning("execution(*  *..*.service.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println(" ---- afterReturning advice ------");
	}
	

	@AfterThrowing(value="execution(*  *..*.service.ProductService.*(..))",throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println(" ---- afterThrowing advice"+ex+" ------");
	}
	
	@Around("execution(*  *..*.service.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		//before advice 
		System.out.println("@Around(before) Advice");
		
		//PointCut Method 실행
		
		//파라미터 가로채기(바꿔버리기)
//		Object[] params= {"camera"};
//		Object result =pjp.proceed(params);
		
		Object result = pjp.proceed();
		
		
		//after advice 
		System.out.println("@Around(after) Advice");
		return result;
	}

}
