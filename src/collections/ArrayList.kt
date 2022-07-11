package collections

fun main(args: Array<String>) {

    //array
    val array = arrayOf("Texas","Towa","California")
    val mixed = arrayOf("Kotlin",16,true,9.8)
    val numbers = intArrayOf(6,8,9)
    println(mixed[1])
    mixed[1]="hello"
    println(mixed[1])

    val str="Udemy"
    println(str[4])

    val states = arrayOf("Florida")
    val allStates = array+states

    println(allStates.size)

    val isempty : Boolean = allStates.isEmpty()

    if(allStates.contains("California")){
        println("Contains California")
    }else{
        println("Doesn't")
    }


    //lists -> immutable cannot reassign
    val list= listOf("Apple","Orange","Banana")
    val arrayList= arrayListOf("POXO","Apple","Sumsung")
    println(arrayList[0])
    println(arrayList + list)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Hello"))
}