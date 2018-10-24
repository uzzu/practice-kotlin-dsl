import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

apply(from = "../dependencies.gradle")
apply(from = "keystore.gradle")

println(extra)

val compileVersion: Int by extra
val targetVersion: Int by extra
val minVersion: Int by extra

android {
    compileSdkVersion(compileVersion)
    defaultConfig {
        minSdkVersion(minVersion)
        targetSdkVersion(targetVersion)
        applicationId = "com.github.uzzu.myapplication"
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName(name)
        }
        getByName("release") {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName(name)
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

val appCompatVersion: String by extra
val constraintLayoutVersion: String by extra
val junitVersion: String by extra
val supportTestRunnerVersion: String by extra
val espressoCoreVersion: String by extra

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinCompilerVersion.VERSION}")

    implementation("com.android.support:appcompat-v7:$appCompatVersion")
    implementation("com.android.support.constraint:constraint-layout:$constraintLayoutVersion")
    testImplementation("junit:junit:$junitVersion")
    androidTestImplementation("com.android.support.test:runner:$supportTestRunnerVersion")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:$espressoCoreVersion")
}
