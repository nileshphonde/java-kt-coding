package `kt-code`

class P(val name: String)
data class User(val name:String)

class Student(val name:String, val age:Int) {

    init {
        println("Object created $name, $age")
    }

    fun display() {
        println(this.toString())
    }
}

object Single {

    init {
        println("init")
    }
    fun connect() {
        println("Connecting...")
    }
}

class Person {

    companion object {
        fun display() {
            println("Displaying...")
        }
    }
}
fun main() {

    // Difference between var and val
    //p1()

    // null safety
    //p2()

    // Difference between == and ===
    //p3()

    // late init vs lazy
    //p4()

    val user: P by lazy {
        P("Nilesh")
    }
    Single.connect()
    Person.display()
    Single.connect()

    print(user.name)

    val obj = Student("John", 35)
    obj.display()
}


fun p4() {

    lateinit var x: String

    x = "nilesh"
    println(x) // without initialization it will throw UninitializedPropertyAccessException

    val name: String by lazy {
        println("Initializing name...")
        "xxx"
    }

    println(name)
}

fun p1() {
    val x = "nilesh"

//    x = "shailesh" // can't reassign
    println(x)

    var y = "nilesh"
    y = "shailesh" // can reassign
    println(y)
}
fun p2() {

    // nullable type operator
    var x: String? = "nilesh"
   // x = null

    // safe call operator
    println(x?.length)

    // Not-null assertion operator
 //   println(x!!.length)

    // elvis operator
    val length = x?.length ?: 0
    println(length)
}

fun p3() {

    var a = "hello"
    var b = "hello"

    println(a == b)
    println(a === b)

    var x = User("nil")
    var y = User("nil")

    println()
    println(x == y)
    println(x === y)

    y = x

    println()
    println(x == y)
    println(x === y)

    var c = P("nil")
    var d = P("nil")

    println()
    println(c == d)
    println(c === d)

}