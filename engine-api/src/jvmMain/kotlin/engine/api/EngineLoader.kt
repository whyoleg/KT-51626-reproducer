package engine.api

import java.util.*

interface EngineContainer {
    val engine: Engine
}

actual object EngineLoader {
    private val engines = mutableListOf<Engine>()

    init {
        EngineContainer::class.java
            .let { ServiceLoader.load(it, it.classLoader) }
            .forEach { register(it.engine) }
    }

    actual fun register(engine: Engine) {
        engines += engine
    }

    actual fun registered(): List<Engine> = engines
}
