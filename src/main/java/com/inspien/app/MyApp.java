package com.inspien.app;


import com.inspien.annotation.Autowired;
import com.inspien.annotation.Component;
import com.inspien.app.testComponent.TestComponent;
import com.inspien.container.impl.IOCContainer;

@Component
public class MyApp {

    @Autowired
    private TestComponent testComponent;

    public void run() {
        System.out.println("MyApp is running.");
        TestComponent testComponent = IOCContainer.getBean(TestComponent.class);
        testComponent.sayHello();
    }

    public static void main(String[] args) {
        IOCContainer container = new IOCContainer("com.inspien");
        MyApp app = container.getBean(MyApp.class);
        app.run();
    }

    public TestComponent getTestComponent() {
        return testComponent;
    }


}