buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    val sql_delight_version = "1.5.0"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:4.2.1")
        classpath("com.squareup.sqldelight:gradle-plugin:$sql_delight_version")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}