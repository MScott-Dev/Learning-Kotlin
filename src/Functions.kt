fun main() {
    welcome("Calyse", 20)
    quote()
    welcome(age=25, name="Matthew")
    quote()
    welcome("Glenn")
    quote()
    println()
    println(double(10))
    println(twoValues())
    println(threeValues())
//
    foo(bar = {
        println("Bar as a function")
    })
    foo { println("This also works") }
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

fun foo(bar: () -> Unit) {
    println("Bar function")
    bar()
}

//fun double(number: Int) : Int {
//    return number * 2
//}

// single expression function
fun double(n: Int) = n * 2

fun twoValues(): Pair<String, Int> {
    return "Test" to 20
}

fun threeValues(): Triple<String, Int, Char> {
    return Triple("Test", 20, 'Z' )
}