fun main() {
    welcome("Calyse", 20)
    quote()
    welcome(age=25, name="Matthew")
    quote()
}

fun welcome(name: String, age: Int) {
    println("Welcome $name!")
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}

fun quote() {
    println("Come on in!")
}