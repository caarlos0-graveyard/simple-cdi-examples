package cdi.example6;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import lombok.extern.log4j.Log4j;

@Log4j
@TimeLogged
@Interceptor
public class TimeLoggedInterceptor {
    @AroundInvoke
    public Object logMethodEntry(InvocationContext invocationContext) throws Exception {
        log.info(System.currentTimeMillis());
        return invocationContext.proceed();
    }
}
