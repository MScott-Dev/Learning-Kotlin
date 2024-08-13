fun main() {
    val names = mutableListOf(
        "Calyse",
        "Matt",
        "Sean",
        "Glenn"
    )
    println(names.size)
    println(names[2])
    println(names)
    names.remove("Glenn")
    println(names)
    names.add("Harvey")
    println(names)
}