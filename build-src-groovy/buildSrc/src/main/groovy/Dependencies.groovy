
@SuppressWarnings("GroovyUnusedDeclaration")
class AndroidSdk {
    static final compileSdkVersion = 28
    static final targetSdkVersion = 28
    static final minSdkVersion = 21
}

class Versions {
    // for Kotlin
    static final kotlin = "1.2.71"

    // for BuildScript
    static final androidGradlePlugin = "3.2.0"

    // for Lib
    static final appCompatV7 = "28.0.0"
    static final constraintLayout = "1.1.2"

    // for TestLib
    static final jUnit = "4.12"
    static final supportTestRunner = "1.0.2"
    static final espresso = "3.0.2"
}

@SuppressWarnings("GroovyUnusedDeclaration")
class BuildScript {
    static final androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    static final kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

@SuppressWarnings("GroovyUnusedDeclaration")
class Lib {
    static final kotlinStdLibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    static final appCompatV7 = "com.android.support:appcompat-v7:${Versions.appCompatV7}"
    static final constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
}

@SuppressWarnings("GroovyUnusedDeclaration")
class TestLib {
    static final jUnit = "junit:junit:${Versions.jUnit}"
    static final supportTestRunner = "com.android.support.test:runner:${Versions.supportTestRunner}"
    static final espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}

