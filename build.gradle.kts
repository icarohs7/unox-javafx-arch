plugins {
    defaults.`root-module`
    jacoco
    id("com.github.ben-manes.versions")
    id("com.vanniktech.dependency.graph.generator")
}

setupJacocoMultimodule()