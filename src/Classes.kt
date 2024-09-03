fun main() {
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 1000.0
    val phone = SmartDevice()
    phone.brand = "Google"
    phone.price = 700.0
    phone.color = "Blue"
}

// Blueprint
class  SmartDevice {
    //    properties
    //    behaviors
    var brand: String = ""
    var color: String = ""
    var price: Double = 0.0
}