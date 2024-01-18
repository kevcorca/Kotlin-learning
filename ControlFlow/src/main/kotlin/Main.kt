fun main(args: Array<String>) {
    val alarm = 7

//    when statement
//    when(alarm){
//        12 -> println("The time is $alarm")
//        7 -> println("The time is $alarm")
//        14 -> println("The time is $alarm")
//        else -> println("The time is $alarm")
//    }
//
//    ********************************************
//
//    when(alarm){
//        12, 7, 14 -> println("The time is $alarm")
//        else -> println("not correct !")
//    }
//
//    ********************************************
//
//
//
//    val text = when(alarm){
//        in 1..10 -> {
//            "the number is in range of 1 .. 10"
//        }
//        12, 7, 14 -> {
//            println("Some text")
//            "the time is $alarm"
//        }
//        else -> {
//            "the time is $alarm"
//        }
//    }
//
//    ********************************************
//
    val text = when (alarm) {
        12, 7, 14 -> "the time is $alarm"
        in 1..10 -> "the number is in range of 1 .. 10"
        else -> "the time is $alarm"
    }

    println("$text")

}