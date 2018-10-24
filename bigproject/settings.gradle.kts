rootProject.name = "bigproject"

// region subprojects

fun Settings.includeSubProject(name: String) {
    include(":$name")
    project(":$name").projectDir = File("$rootDir/subprojects/$name")
    project(":$name").buildFileName =
        if (File("$rootDir/subprojects/$name/$name.build.gradle.kts").exists()) {
            "$name.build.gradle.kts"
        } else {
            "$name.build.gradle"
        }
}

includeSubProject("infra")
includeSubProject("app")

// endregion
