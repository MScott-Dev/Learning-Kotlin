fun main() {
    var names = arrayOf<String>("Calyse", "Matthew", "Glenn", "Sean")
    var things = arrayOf("Calyse", 2, true)

    println(names.contentToString())
    println(names[0])
    println("I love " + names[0])
    println(names.size)
    if ("Calyse" in names) {
        println("I love you so much")
    } else {
        println("Where are you!?")
    }
}