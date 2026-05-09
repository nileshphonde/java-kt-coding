package `kt-code`

fun main() {

    greet()
    greet("Nilesh")
    greet("Shailesh")

    displayInfo(age = 18, name = "Nil")
    createUser(age = 18)
    createUser(name = "Hari", age = 20)
    createUser(age = 30, country = "Us")
}

fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun displayInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun createUser(name: String = "Guest", age: Int, country: String = "India") {
    println("Name: $name, Age: $age, Country: $country")
}