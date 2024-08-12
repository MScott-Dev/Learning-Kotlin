fun main() {
    val n1 = 31
    val n2 = 20

//    if (n1 >= n2 || n1 <= 30) {
//        println("first")
//    } else if (n1 == 100) {
//        println("second")
//    } else {
//        println("third")
//    }

    when {
        (n1 >= n2 || n1 <= 30) -> println("First")
        (n1 == 200) -> println("Hundred")
        else -> println("Failed case")
    }

    val age = 25

    when (age) {
        in 18..30 -> println("Adult")
        !in 0..17 -> println("Kid")
        else -> println("Unknown")
    }
}