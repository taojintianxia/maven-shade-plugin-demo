package com.github.taojintianxia.maven.shadeplugin.moduleroot.maven.shadeplugin.moduleb;

import com.google.common.base.Objects;
import com.google.common.base.Strings;


public class ModuleBTest {
    
    public static void testGuava18API() {
        // this is a deprecated API, will throw Exception in a higher guava definitely
        Objects.toStringHelper("");
    }
    
    public static void main(String... args) {
        testGuava18API();
    }
}
