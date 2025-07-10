plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // No dependencies for now
}

application {
    mainClass.set("MainKt")
}