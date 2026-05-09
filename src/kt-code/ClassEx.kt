package `kt-code`

interface Flyable {
    fun fly()
}
abstract class Animal {
    abstract fun sound()
    fun sleep () {
        println("Sleeping")
    }
}
class Normal(val name: String = "", val age: Int = 0): Animal(), Flyable {
    var country: String = ""

    constructor(country: String) : this() {
        this.country = country
    }

    override fun sound() {
        println("sound")
    }

    override fun fly() {
        println("fly")
    }
}

fun main() {

    val obj = Normal("nilesh", 20)
    println(obj.name)
    println(obj.age)
    println(obj.country)

    val normal = Normal("India")
    println(normal.name)
    println(normal.age)
    println(normal.country)
    obj.sound()
    obj.sleep()
    obj.fly()
}

