fun main() {
    var number = 1
    while (number <= 5) {
        println("Number is $number")
        ++number
    }
    println("---")
    val brand = "Subaru"
    var index = 0
    while (index <= brand.length - 1) {
        println("${brand[index]}")
        ++index
    }
}