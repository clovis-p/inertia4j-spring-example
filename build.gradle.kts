plugins {
    id("java")
    id("org.springframework.boot") version "4.0.6"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "io.github.inertia4j"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.inertia4j:inertia4j-spring-boot-4:1.0.4")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql:42.7.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootRun {
    debugOptions { host = "*" }
}
