fun main() {
    println("Count")
    for (i in 1..5) println(i)
    println("Count Down")
    for (i in 5 downTo 1) println(i)
    println("Steps")
    for (i in 1..5 step 2) println(i)
    println("Steps counting down")
    for (i in 5 downTo 1 step 2) println(i)
}