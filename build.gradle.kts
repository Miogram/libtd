plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "org.drinkless.tdlib"
    compileSdk = 36

    sourceSets {
        getByName("main") {
            jniLibs.directories.add("src/main/libs")
        }
    }
}

dependencies {
    implementation(libs.androidx.annotation)
}

