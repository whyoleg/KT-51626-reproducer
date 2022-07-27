package engine.impl

import engine.api.*

@Suppress("DEPRECATION")
@OptIn(ExperimentalStdlibApi::class, ExperimentalJsExport::class)
@EagerInitialization
@JsExport
@Deprecated("", level = DeprecationLevel.HIDDEN)
public val initHook: dynamic = EngineLoader.register(EngineImpl)

actual object EngineImpl : Engine {
    override val name: String get() = "JS"
}
