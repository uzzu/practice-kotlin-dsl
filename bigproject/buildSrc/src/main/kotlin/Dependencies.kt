import org.gradle.kotlin.dsl.DependencyHandlerScope

@Suppress("unused")
object AndroidSdk {
    const val compileSdkVersion = 28
    const val targetSdkVersion = 28
    const val minSdkVersion = 21
}

object Versions {
    // for Kotlin
    const val kotlin = "1.2.71"

    // for BuildScript
    const val androidGradlePlugin = "3.2.0"

    // for Lib
    const val appCompatV7 = "28.0.0"
    const val constraintLayout = "1.1.2"

    // for TestLib
    const val jUnit = "4.12"
    const val supportTestRunner = "1.0.2"
    const val espresso = "3.0.2"
}

@Suppress("unused")
object BuildScript {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

@Suppress("unused")
object Lib {
    const val kotlinStdLibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompatV7 = "com.android.support:appcompat-v7:${Versions.appCompatV7}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
}

@Suppress("unused")
object TestLib {
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val supportTestRunner = "com.android.support.test:runner:${Versions.supportTestRunner}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}

private const val testImplementation = "testImplementation"
private const val androidTestImplementation = "androidTestImplementation"

fun DependencyHandlerScope.sharedTestDependencies() {
    testImplementation(TestLib.jUnit)
    androidTestImplementation(TestLib.supportTestRunner)
    androidTestImplementation(TestLib.espressoCore)
}

