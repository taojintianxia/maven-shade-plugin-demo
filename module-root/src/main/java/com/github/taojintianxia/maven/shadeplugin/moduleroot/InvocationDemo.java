package com.github.taojintianxia.maven.shadeplugin.moduleroot;

import com.github.taojintianxia.maven.shadeplugin.moduleroot.maven.shadeplugin.modulea.ModuleATest;
import com.github.taojintianxia.maven.shadeplugin.moduleroot.maven.shadeplugin.moduleb.ModuleBTest;

public class InvocationDemo {
    public static void main(String[] args) {
        ModuleATest.testGuava31API();
        ModuleBTest.testGuava18API();
    }
}