package com.furkantokgoz.aop.interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorClass
public class InterceptorTargetWorkClass {

    @AroundInvoke public Object logging(InvocationContext ic) throws Exception {
        System.out.println("First stage : " + ic.getMethod().getName());

        //is user logged in
        boolean isLogging = false;//yol kesici değişkeni
        Object isContinue = null;
        if(isLogging){
            System.out.println("Please login the system !");
            return null;
        }else{
            try {
                isContinue = ic.proceed();
                System.out.println("Second stage : " + isContinue.toString());
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
