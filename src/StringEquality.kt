fun main() {
    val name1 = "Matthew"
    val name2 = "Calyse"
    val name3 = "Matthew"

    println(name1 == name2)
    println(name1.equals(name2))

    println(name1 == name3)
    println(name1.equals(name3))

    println("== ${name1 == name3}")
    println(".equals ${name1.equals(name3)}")

    println("=== ${name1 === name3}")
}