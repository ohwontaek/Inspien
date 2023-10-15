package com.inspien.app.testComponent;

import com.inspien.annotation.Autowired;
import com.inspien.annotation.Component;
import com.inspien.app.MyApp;
@Component

public class TestComponent {



    public void sayHello() {
        System.out.println("Hello from TestComponent.");
    }
}