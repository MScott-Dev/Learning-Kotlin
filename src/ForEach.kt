fun main() {
    val names = listOf("Glenn", "Matt", "Sean", "Calyse")
    names.forEach { println(it) }
    println("----")
    for (name in names) {
        println("$name is here.")
    }
}