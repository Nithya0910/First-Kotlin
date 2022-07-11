package codingChallenge

fun main(args: Array<String>) {
    var bookTitles = arrayListOf("Exceptions", "Collections")

    for (i in bookTitles) {
        if (i.contains('e')) {
            for (char in i) {
                println(char)
            }
        }

    }
}