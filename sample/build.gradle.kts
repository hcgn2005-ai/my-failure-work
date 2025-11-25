import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
    kotlin("jvm") version "1.9.0"
}

repositories {
    maven { url = uri("https://repo.cloudstream.ws/repository/maven-public/") }
    mavenCentral()
}

dependencies {
    implementation("com.lagradost:cloudstream3:1.5.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}
