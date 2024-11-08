plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js {
        nodejs()
        browser()
    }
    wasmJs {
        nodejs()
    }
    wasmWasi()

    mingwX64()
    linuxX64()
    macosX64()
    macosArm64()
}
