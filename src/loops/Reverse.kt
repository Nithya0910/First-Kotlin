package loops

fun main(args: Array<String>) {
    val numbers = listOf(5, 9, 7, 2, 4)
    println(reverse(numbers))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in 0..list.size - 1) {
        result.add(list[list.size - 1 - i])
    }
    return result

}

fun reverse1(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.indices) {
        result.add(list[list.size - 1 - i])
    }
    return result
}

fun reverse2(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in list.size-1 downTo 0) {
        result.add(list[i])
    }
    return result

}

