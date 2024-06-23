plugins {
    java
    application
    id("io.spring.dependency-management")
    id("org.springframework.boot")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
    mavenCentral()
}

//configurations {
//    compileOnly {
//        extendsFrom annotationProcessor
//    }
//}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")


    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")


    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
//    runtimeOnly("com.mysql:mysql-connector-j")
//    runtimeOnly("com.oracle.database.jdbc:ojdbc11")
//    runtimeOnly("org.postgresql:postgresql")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
