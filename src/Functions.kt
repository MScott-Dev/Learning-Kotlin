fun main() {
    welcome("Calyse", 20)
    quote()
    welcome(age=25, name="Matthew")
    quote()
    welcome("Glenn")
    quote()
}

fun welcome(name: String, age: Int = -1) {
    println("Welcome $name!")
    if (age >= 16) {
        println("$name is an adult")
    }
    else if (age == -1) {
        println("Age not provided")
    } else {
        println("$name is not an adult")
    }
}

fun quote() {
    println("Come on in!")
}