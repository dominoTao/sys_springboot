package com.tao.core.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner  implements CommandLineRunner {
    @Value("${name}")
    private String name;
    @Override
    public void run(String... args) throws Exception {
        // TODO : do something
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println(name);
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
