package com.taojintianxia.springboothelloworld.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

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
        Resource bashFileResource = new ClassPathResource("templates/run.sh");
        InputStream inputStream = bashFileResource.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] cache = new byte[512];
        while (inputStream.read(cache) > -1) {
            byteArrayOutputStream.write(cache);
        }

        System.out.println(byteArrayOutputStream.toString());
    }
}

