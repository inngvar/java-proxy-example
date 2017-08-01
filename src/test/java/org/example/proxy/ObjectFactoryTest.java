package org.example.proxy;


import org.junit.Assert;
import org.junit.Test;


/**
 * Created by igorch on 01.08.17.
 */
public class ObjectFactoryTest {

    @Test
    public void objectFactoryTest() throws InstantiationException, IllegalAccessException {
        ObjectFactory objectFactory = new ObjectFactory();
        Animal dog = (Animal) objectFactory.createInstance(Dog.class);
        Animal cat = (Animal) objectFactory.createInstance(Cat.class);
        Assert.assertNotEquals(ExampleInvocationHandler.PROXY_METHOD_INVOKED, dog.say());
        Assert.assertEquals(ExampleInvocationHandler.PROXY_METHOD_INVOKED, cat.say());
    }
}
