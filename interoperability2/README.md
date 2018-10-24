元々のGradle scriptが巨大な場合に徐々にGradle Kotlin DSLに移行する例

1. 元のbuild.gradleをlagacy.gradleにrename
2. build.gradle.ktsを作成し、plugins scopeだけとりあえず書く
3. lagacy.gradleをapplyする

その後、徐々にbuild.gradle.ktsにうつしていく。dependencies あたりからやるのが楽そう

