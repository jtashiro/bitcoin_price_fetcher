plugins {
    kotlin("jvm") version "1.9.23"  // Replace with your Kotlin version
}

group = "com.fiospace"  // Replace with your group/package name
version = "1.0"

repositories {
    // Add repositories if needed
    google()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Add other dependencies as needed
}
tasks.register<Jar>("createJar") {
    archiveBaseName.set("bitcoin_price_fetcher") // Adjust the base name as needed
    from(sourceSets.main.get().output)
    from("app/build/intermediates/javac/release/compileReleaseJavaWithJavac/classes/")
    manifest {
        attributes["Main-Class"] = "com.example.MainKt" // Replace with your main class name
    }
}
tasks.register<Delete>("deleteJar") {
    delete("build/libs/bitcoin_price_fetcher-1.0.jar")
}

