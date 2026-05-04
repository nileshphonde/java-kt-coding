package `kt-code`

import java.util.Locale
import java.util.Locale.getDefault

class Emp() {
    var name = ""
    var age = 0

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
}

fun main() {

    val name = "nilesh"

    val result = with(name) {
        this.length
        this.lowercase()
    }

    val obj = Emp().apply {
        this.name = "Nilesh"
        this.age = 20
    }

    val gg = Emp().also {
        it.name = "gg"
        it.age = 30
    }

    println(result)
    println(obj.name)
    println(gg.name)
}