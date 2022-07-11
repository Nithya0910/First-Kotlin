package oops

class House(val height:Double, val color:String,val price:Int=6000) {  //Default value

    fun print(){
        println("House (Height : $height , Color : $color and Price : $price)")
    }

}

//Named Paramters - more Readable
fun main(args: Array<String>) {
    val house = House(height = 4.4, color = "Blue", price = 15000)
    val yellowHouse = House(color = "yellow", height = 8.9)
    house.print()
    yellowHouse.print()
}