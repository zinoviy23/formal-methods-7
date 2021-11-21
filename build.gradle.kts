plugins {
    java
    id("info.solidsoft.pitest") version "1.7.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    test {
        useJUnitPlatform()
    }
}

pitest {
    pitestVersion.set("1.7.0")
    testPlugin.set("junit5")
    junit5PluginVersion.set("0.15")
    targetClasses.set(listOf("ispras.formalMethods.task7.impl.*"))
    verbose.set(true)
    mutators.set(listOf("ALL"))
    targetTests.set(listOf("ispras.formalMethods.task7.impl.GeneratedTests"))
    timestampedReports.set(false)
}