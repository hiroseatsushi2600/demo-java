plugins {
    id("com.example.demo.base")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.security:spring-security-oauth2-jose")
}

base.archivesName.set("auth")

tasks.named("bootRun") {
    enabled = false
}
