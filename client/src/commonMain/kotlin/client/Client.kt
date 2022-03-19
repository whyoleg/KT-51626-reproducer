package client

import engine.api.*

class Client {
    private val engine = EngineLoader.registered().first()

    fun engineName(): String {
        return engine.name
    }
}
