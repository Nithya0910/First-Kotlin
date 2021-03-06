package loops

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..10) {
        sum = sum + i
    }
    println(sum)

    val list = listOf("Java","Kotlin","Python")
    for(element in list){
        println(element)
    }

    for((index,value) in list.withIndex()){
        println("elements at $index is $value")
    }

    var x=9
    while(x>=0){
        println(x)
        x--
    }
}