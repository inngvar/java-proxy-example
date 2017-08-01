package org.example.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by igorch on 01.08.17.
 */
public class ObjectFactory {


    /**
     * Create object instance or it proxy.
     *
     * @param clazz
     * @return
     */
    public Object createInstance(Class clazz) throws IllegalAccessException, InstantiationException {
        if (clazz.isAnnotationPresent(ProxyInfo.class)) {
            ProxyInfo proxyInfo = (ProxyInfo) clazz.getAnnotation(ProxyInfo.class);
            return Proxy.newProxyInstance(clazz.getClassLoader(),
                    clazz.getInterfaces(), proxyInfo.invocationHandler().newInstance());

        }
        return clazz.newInstance();
    }
}


