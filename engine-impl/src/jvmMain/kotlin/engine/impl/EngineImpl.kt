package engine.impl

import engine.api.*

class EngineImplContainer : EngineContainer {
    override val engine: Engine
        get() = EngineImpl
}

actual object EngineImpl : Engine {
    override val name: String get() = "JVM"
}
