package com.surya.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class MyPointcut extends DynamicMethodMatcherPointcut {

	@Override
    public ClassFilter getClassFilter() {
        return new ClassFilter(){
            @Override
            public boolean matches(Class<?> cls)
            {
                // Only SimpleBean class, not other classes
            	
                return cls.getName().endsWith("BankTrans");
            }
        };
    }
	@Override
	public boolean matches(Method arg0, Class<?> arg1, Object... arg2) {
		
		System.out.println("[][][][][]["+arg0.getName());
			return true;
		
	}

}
