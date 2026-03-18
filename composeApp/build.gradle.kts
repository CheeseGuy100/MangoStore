plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("plugin.compose")
    kotlin("plugin.serialization") version "1.9.22"
}

kotlin {
    androidTarget()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
                implementation("io.ktor:ktor-client-core:2.3.7")
                implementation("io.ktor:ktor-client-content-negotiation:2.3.7")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.7")
                implementation("androidx.compose.material:material-icons-extended:1.5.4")
                implementation("io.coil-kt:coil-compose:2.6.0")
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(compose.preview)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
                implementation("androidx.activity:activity-compose:1.8.0")
                implementation("io.ktor:ktor-client-android:2.3.7")
            }
        }
    }
}

android {
    namespace = "com.mangostore.ui"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mangostore.ui"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0-Alpha"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}