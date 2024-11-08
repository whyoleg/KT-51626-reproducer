package engine.impl

import engine.api.*

@Suppress("DEPRECATION")
@OptIn(ExperimentalStdlibApi::class)
@EagerInitialization
private val initHook = EngineLoader.register(EngineImpl)

actual object EngineImpl : Engine {
    override val name: String get() = "NATIVE"
}
