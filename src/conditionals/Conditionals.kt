package conditionals

fun main(args: Array<String>) {
    val mode: Int = 3
    val result =when (mode) {
        1 -> ("The mode is Lazy")
        2 -> ("This mode is busy")
        3 -> ("The mode is super-productive")
        else -> ("I dont know that mode ")
    }
    println(result)

    val x =if(mode < 2){
        println("Mode is less than 2")
        17
    }else{
       42
    }
 println(x)
}