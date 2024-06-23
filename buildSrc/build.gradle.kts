plugins {
	`kotlin-dsl`
	`java-gradle-plugin`
}

repositories {
	gradlePluginPortal()
}

val springBootPluginVersion: String by project

dependencies {
	implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.6.10")

    implementation("io.spring.gradle:dependency-management-plugin:1.1.5")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.1")

}
