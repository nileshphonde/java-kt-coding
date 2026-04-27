package `kt-code`

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking
import sun.rmi.server.Dispatcher

fun main() = runBlocking {

    flow {
        for (i in 1..5) {
            emit(i)
            delay(1000)
        }
        throw RuntimeException("Caught Exception!")
    }.flowOn(Dispatchers.IO).onStart {
        println("flow started")
    }.onCompletion {
        println("flow completed")
    }.map {
        it * 2
    }.catch { e ->
        println(e.localizedMessage)
    }.collect {
        println("collected $it")
    }
}