fun main() {
    var email = """
        Hello %s
        how 
        are 
        you?
    """.trimIndent()

    println(email.format(args = arrayOf("Calyse")))
}