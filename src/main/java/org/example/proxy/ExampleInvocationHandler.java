package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by igorch on 01.08.17.
 */
public class ExampleInvocationHandler implements InvocationHandler {

    public static final String PROXY_METHOD_INVOKED = "Proxy Method Invoked\r\n";
    private Object source;

    public ExampleInvocationHandler(Object source){

        this.source = source;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(PROXY_METHOD_INVOKED);
        Object result =  method.invoke(source,args);
        System.out.print( result);
        return result;
    }
}
