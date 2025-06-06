plugins {
    alias(libs.plugins.self.library)
}

android {
    namespace = "com.dergoogler.mmrl.hidden_api"
}

android {
    buildTypes {
        create("playstore") {
            initWith(buildTypes.getByName("release"))
        }
        create("releaseCandidate") {
            initWith(buildTypes.getByName("release"))
        }
        create("beta") {
            initWith(buildTypes.getByName("release"))
        }
        create("spoofed") {
            initWith(buildTypes.getByName("release"))
        }
        create("alpha") {
            initWith(buildTypes.getByName("release"))
        }
        create("debugMin") {
            initWith(buildTypes.getByName("debug"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    annotationProcessor(libs.rikka.refine.compiler)
    compileOnly(libs.rikka.refine.annotation)
    compileOnly(libs.androidx.annotation)
}
