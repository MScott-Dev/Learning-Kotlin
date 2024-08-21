fun main() {
    val brand = "Pepsi"
    for (letter in brand) {
        println(letter)
    }
    println("Reversed")
    for (letter in brand.reversed()) {
        println(letter)
    }
}