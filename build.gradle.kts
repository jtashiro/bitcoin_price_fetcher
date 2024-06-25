plugins {
    kotlin("jvm") version "1.9.23"  // Replace with your Kotlin version
    id("java-library")
    id("application")

}

group = "com.fiospace"  // Replace with your group/package name
version = "1.0"

repositories {
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

application {
    mainClass.set("com.fiospace.bitcoin_price_fetcher.BitcoinPriceFetcher")
}

tasks.register<JavaExec>("runBitcoinPriceFetcher") {
    group = "application"
    description = "Runs the BitcoinPriceFetcher main method"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.fiospace.bitcoin_price_fetcher.BitcoinPriceFetcher")
}