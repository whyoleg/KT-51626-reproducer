plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js {
        nodejs()
        browser()

        // breaks build
        useEsModules()
    }
    wasmJs {
        nodejs()
    }
    wasmWasi()

    mingwX64()
    linuxX64()
    macosX64()
    macosArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":engine-api"))
            }
        }
        val commonTest by getting {
            dependencies {
                api(kotlin("test"))
                api(project(":engine-impl"))
            }
        }
    }
}
