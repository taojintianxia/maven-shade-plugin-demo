package com.taojintianxia.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author Nianjun Sun
 * @date 2018/12/12 15:40
 */

@RestController()
public class HelloWorldController {

    @GetMapping("hello")
    public String helloWorld() {
        System.out.println("Hello World");
        return "Hello, World !";
    }

    @GetMapping("test")
    public void test() throws IOException {
        System.out.println("start to print file inside jar");
//        Resource bashFileResource = new ClassPathResource("templates/");
//        InputStream inputStream = bashFileResource.getInputStream();
//        File fromFile = bashFileResource.getFile();
//        File toFile = new File("/Users/sunnianjun/Incubator/duowen-workspace/templates/");
//        com.google.common.io.Files.copy(fromFile,toFile);

        JarFile jarFile = new JarFile("/Users/sunnianjun/Incubator/Github/springboot-hello-world/target/springboot-hello-world-0.0.1-SNAPSHOT.jar");
        for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements();){

        }
    }
}

