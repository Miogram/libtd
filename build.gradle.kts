plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "org.drinkless.tdlib"
    compileSdk = 36

    defaultConfig {
        minSdk = 27
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    sourceSets {
        getByName("main") {
            jniLibs.directories.setFrom("src/main/libs")
        }
    }

    lint {
        disable += "InvalidPackage"
    }
}

dependencies {
    implementation(libs.androidx.annotation)
}

