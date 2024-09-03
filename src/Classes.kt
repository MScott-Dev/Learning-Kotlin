fun main() {
    val tv = SmartDevice("Samsung Smart TV QLED", "Black", 1000.0, false)
    val tv2 = SmartDevice("Samsung Smart TV QLED", "Black", 1000.0, false)
    println("${tv.brand} is ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()
    val phone = SmartDevice("Google Pixel", "Blue", 700.0, true)
    println("${phone.brand} has a ${phone.color} one for ${phone.price}!")
    phone.getDeviceState()
    println(tv.toString())
    println(tv == tv2)
    println(tv === tv2)
}

// Blueprint
class SmartDevice constructor(
    var brand: String,
    var color: String,
    var price: Double,
    var state: Boolean
) {
    //    method/functions
    fun turnOn() {
        state = true
        println("$brand is switching on")
    }
    fun turnOff() {
        state = false
        println("$brand is switching off")
    }
    fun getDeviceState() {
        println("$brand is currently on: $state")
    }
//    Generate toString()
    override fun toString(): String {
        return "SmartDevice(brand='$brand', color='$color', price=$price, state=$state)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (color != other.color) return false
        if (price != other.price) return false
        if (state != other.state) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + color.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + state.hashCode()
        return result
    }

}