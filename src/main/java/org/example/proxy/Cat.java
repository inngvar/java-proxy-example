package org.example.proxy;

/**
 * Created by igorch on 01.08.17.
 */
@ProxyInfo(invocationHandler = ExampleInvocationHandler.class)
public class Cat implements Animal {

    @Override
    public String say() {
        return "Myaaauuu";
    }
}
