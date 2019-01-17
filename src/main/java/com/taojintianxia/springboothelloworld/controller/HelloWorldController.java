package com.taojintianxia.springboothelloworld.controller;

import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;
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
        for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements(); ) {
            JarEntry entry = entries.nextElement();
            System.out.println(entry.getName());
        }
    }

    private static void copyResourceToDirectory(JarFile jarFile, String rootResource, File destination) {
        Objects.requireNonNull(jarFile, "jar file can not be null");
        Objects.requireNonNull(rootResource, "root resource can not be null");
        Objects.requireNonNull(destination, "destination can not be null");

        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries != null && entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (entry != null && rootResource.startsWith(entry.getName())) {
                if (entry.isDirectory()) {
                    createSourceDirectory(entry, rootResource, destination);
                } else {

                }
            }
        }
    }

    private static void createSourceDirectory(JarEntry jarEntry, String rootResource, File destination) {
        String entryName = jarEntry.getName();
        String folderName = entryName.substring(entryName.indexOf(rootResource) + rootResource.length());
        if (Strings.isNullOrEmpty(folderName) || folderName.equals("/")) {
            return;
        }
        File resourceFolder = new File(destination.getAbsolutePath() + folderName);
        resourceFolder.mkdirs();
    }

    public static void main(String... args) {
        String fullName = "BOOT-INF/classes/templates/";
        String name = "BOOT-INF/classes/templates/".substring(fullName.indexOf("BOOT-INF/classes/") + fullName.length());
        System.out.println(name);
    }
}

