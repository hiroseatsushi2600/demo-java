plugins {
	id 'java'
	id 'org.springframework.boot' version '3.2.3'
	id 'io.spring.dependency-management' version '1.1.4'
	id 'org.graalvm.buildtools.native' version '0.9.28'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

java {
	sourceCompatibility = '21'
}

configurations {
	compileOnly {
		extendsFrom annotationProcessor
	}
}

repositories {
	mavenCentral()
}

ext {
	set('springModulithVersion', "1.1.2")
}

dependencies {
	// implementation 'org.springframework.boot:spring-boot-starter-data-rest'
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.springframework.boot:spring-boot-starter-webflux'
	// implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
	implementation 'org.springframework.modulith:spring-modulith-starter-core'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	// developmentOnly 'org.springframework.boot:spring-boot-docker-compose'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'io.projectreactor:reactor-test'
	// testImplementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.3'
	testImplementation 'org.springframework.modulith:spring-modulith-starter-test'
}

dependencyManagement {
	imports {
		mavenBom "org.springframework.modulith:spring-modulith-bom:${springModulithVersion}"
	}
}

tasks.named('test') {
	useJUnitPlatform()
}
