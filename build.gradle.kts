plugins {
    kotlin("jvm") version "1.9.23"  // Replace with your Kotlin version
    id("java-library")

}

group = "com.fiospace"  // Replace with your group/package name
version = "1.0"

repositories {
    // Add repositories if needed
    //google()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.json:json:20240303")

    // Add other dependencies as needed
}



java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
 