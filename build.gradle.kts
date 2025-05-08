plugins {
    id("java")
}

group = "hakuaserver.jp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21.5-R0.1-SNAPSHOT")
    compileOnly("org.spigotmc:spigot:1.21.5-R0.1-SNAPSHOT")
    implementation("org.xerial:sqlite-jdbc:3.44.0.0")
}

