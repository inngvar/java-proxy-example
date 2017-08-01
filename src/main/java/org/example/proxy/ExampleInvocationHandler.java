package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by igorch on 01.08.17.
 */
public class ExampleInvocationHandler implements InvocationHandler {

    public static final String PROXY_METHOD_INVOKED = "Proxy Method Invoked";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return PROXY_METHOD_INVOKED;
    }
}
