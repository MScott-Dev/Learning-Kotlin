fun main() {
    val tv = SmartDevice("Samsung Smart TV QLED", "Black", 1000.0, false)
    println("${tv.brand} is ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()
    val phone = SmartDevice("Google Pixel", "Blue", 700.0, true)
    println("${phone.brand} has a ${phone.color} one for ${phone.price}!")
    phone.getDeviceState()
    println(tv.toString())
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

}