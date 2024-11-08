package engine.api

actual object EngineLoader {
    private val engines = mutableListOf<Engine>()
    actual fun register(engine: Engine) {
        engines += engine
    }

    actual fun registered(): List<Engine> = engines
}
