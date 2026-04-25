package `kt-code`


import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main(): kotlin.Unit = runBlocking {

    flowOf("K", "KK", "Ko", "Kot", "Kotl", "Kotlin")
        .onEach { delay(300) }
        .flatMapLatest { query ->
            flow {
                emit("Searching $query")

                delay(500)
                emit("Processing $query")
            }
        }.collect {
            println(it)
        }

    return@runBlocking

    val progressFlow = flow {
        for (i in 1..100) {
            emit(i)
            delay(250)
        }
    }.filter {
        it % 2 == 0
    }.collect {
        println("$it%")
    }


    val searchFlow = MutableSharedFlow<String>(replay = 1)

    val job = launch {
        searchFlow.flatMapLatest { query ->
            flow {
                emit("Searching $query")
                delay(1000)
                emit("Processing $query")
            }
        }.collect {
            println(it)
        }
    }


    searchFlow.emit("Kotlin")
    delay(500)
    searchFlow.emit("Flow")
    delay(2000)

    job.cancel()

    flowOf("K", "KK", "Ko", "Kot", "Kotl", "Kotlin")
        .onEach { delay(300) }
        .flatMapLatest { query ->
            flow {
                emit("Searching $query")
                delay(500)
                emit("Processing $query")
            }
        }.collect {
            println(it)
        }

    return@runBlocking
    // flow builder
    // flow operator
    // flow collector

    // builders
    // flow {}
    // flowOf()
    // asFlow()
    // channelFlow()

    // operators
    // onstart
    // oncompletion
    // map
    // filter
    // catch
    // flowOn
    // flatMapLatest

    // collectors
    // collect
    // collectAsLatest

    flow {
        flowOf(1, 2, 3, 4, 5).collect {
            emit(it)
            delay(500)
        }
    }.collect {
        println(it)
    }

    return@runBlocking
    flowOf(1, 2, 3)
        .flatMapLatest {
            flowOf("$it A", "$it B")
        }
        .collect { println(it) }

    return@runBlocking

    flow {
        for (i in 1..5) {
            emit(i)
            delay(1000)
        }
        throw RuntimeException("Caught Exception!")
    }.flowOn(Dispatchers.IO)
        .onStart {
            println("Started")
        }.onCompletion {
            println("Completion")
        }.map {
            it * it
        }.catch { e ->
            println(e.localizedMessage)
        }.collect {
            println(it)
        }
}