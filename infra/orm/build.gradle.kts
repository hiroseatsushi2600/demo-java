
plugins {
    id("com.example.demo.base")
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

tasks.named("bootRun") {
    enabled = false
}
