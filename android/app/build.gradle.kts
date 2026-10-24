plugins {
    id("com.android.application")
}

android {
    namespace = "com.codexpro.mobile"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.codexpro.mobile"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.30.2"

        ndk {
            abiFilters += "arm64-v8a"
        }
    }
}
