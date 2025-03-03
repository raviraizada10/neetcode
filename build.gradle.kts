plugins {
    id("java")
}

group = "com.codingconstellation"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.customannotation:ProblemAnnotationsLibrary:1.0-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}