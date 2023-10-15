package com.inspien.container.impl;

import java.util.HashMap;
import java.util.Map;

public class IOCContainer {

    private static Map<Class<?>, Object> beans = new HashMap<>();
    private String basePackage;

    public IOCContainer(String basePackage) {
        this.basePackage = basePackage;
        initializeBeans();
    }

    private void initializeBeans() {


        try {
            Class<?> myAppClass = Class.forName(basePackage + ".app.MyApp");
            Object myApp = myAppClass.newInstance();

            Class<?> testComponentClass = Class.forName(basePackage + ".app.testComponent.TestComponent");
            Object testComponent = testComponentClass.newInstance();



            beans.put(myAppClass, myApp);
            beans.put(testComponentClass, testComponent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T getBean(Class<T> type) {
        return type.cast(beans.get(type));
    }
}
