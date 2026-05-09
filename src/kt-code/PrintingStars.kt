package `kt-code`

fun main() {

//    lStarPattern()
//    rStarPattern()
//    downLStarPattern()
//    downRStarPattern()
    findSecondLargestNumberFromArray()
}

fun findSecondLargestNumberFromArray() {

    val array = arrayOf(10, 45, 32, 67, 45, 90)


    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (i in array.indices) {
       // println(array[i])
        if (array[i] > largest) {
            secondLargest = largest
            largest = array[i]

        }
    }
    println(largest)
    println(secondLargest)

}
fun downRStarPattern() {

}

fun downLStarPattern() {

    var count = 5

    for (i in 1..5) {

        for (j in 1..count) {
            print("*\t")
        }
        count--
        println("\n")
    }
}

fun lStarPattern() {
    var count = 1

    for (i in 1..5) {
        for (j in 1..count) {
            print("*\t")
        }
        count++
        println("")
    }
}

fun rStarPattern() {
    var count = 1
    var space = 4
    for (i in 1..5) {
        for(k in 1..space) {
            print(" \t")
        }
        for (j in 1..count) {
            print("*\t")
        }
        space--
        count++
        println("")
    }
}