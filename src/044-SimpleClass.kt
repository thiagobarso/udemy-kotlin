class Car() {
    fun getCarPrice(): Double {
        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }

    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(
        type: String,
        model: Int,
        price: Double,
        milesDrive: Int,
        owner: String
    ) : this() {
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
        println("constructor1")
    }

    constructor(owner: String):this(){
        this.owner = owner
        println("constructor2")
    }

}

fun main(args: Array<String>) {
    val huCar = Car("BMW", 2015, 10000.0, 105, "Hussein")
    println(huCar.model)
    println(huCar.getCarPrice())
    val jeCar = Car("KA", 2015, 2000.0, 105, "Jena")
    println(jeCar.getCarPrice())
    val leCar = Car("Laya")
}

