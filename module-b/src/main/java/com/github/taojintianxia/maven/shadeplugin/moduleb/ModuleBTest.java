package com.github.taojintianxia.maven.shadeplugin.moduleb;

import com.google.common.base.Objects;

public class ModuleBTest {
    
    public static void testGuava18API() {
        // this is a deprecated API, will throw Exception in a higher guava definitely
        Objects.toStringHelper("");
    }
    
    public static void main(String... args) {
        testGuava18API();
    }
}
