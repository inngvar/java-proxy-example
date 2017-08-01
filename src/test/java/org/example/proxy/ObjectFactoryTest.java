package org.example.proxy;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;


/**
 * Created by igorch on 01.08.17.
 */
public class ObjectFactoryTest {

    @Test
    public void objectFactoryTest() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ObjectFactory objectFactory = new ObjectFactory();
        Animal dog = (Animal) objectFactory.createInstance(Dog.class);
        Animal cat = (Animal) objectFactory.createInstance(Cat.class);
        Dog d = new Dog();
        Cat c = new Cat();
        Assert.assertEquals(d.say(), dog.say());
        Assert.assertEquals(c.say(), cat.say());
    }
}
