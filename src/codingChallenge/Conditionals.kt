package codingChallenge

import java.util.*


fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("Random number is between 1 and 10 $random")
        in 11..20 -> println("Random number is between 11 and 20 : $random")
        in 21..30 -> println("Random number is between 21 and 30: $random")
        in 31..40 -> println("Between 31 and 40: $random")
        else -> println("Above 40: $random")
    }

}