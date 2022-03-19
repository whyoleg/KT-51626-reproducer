package engine.api

interface Engine {
    val name: String
}

expect object EngineLoader {
    fun register(engine: Engine)
    fun registered(): List<Engine>
}
