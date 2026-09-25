

fun main (){
//task 1

    print("Enter n :")
    val n = readln().toInt()

    println("triple = ${3*n}")
    println("square = ${n*n}")

    // task 2

    print("a: ")
    val a = readln().toInt()

    print("b: ")
    val b = readln().toInt()
    println("quotient = ${a/b}")
    println("remainder = ${a%b}")
    println("exact = ${a. toDouble() / b}")

    //task 3

    print("Enter total seconds: ")
    val total = readln().toInt()

    val hours = total / 3600
    val remainder = total % 3600
    val minutes = remainder / 60
    val seconds = remainder % 60

    println("H:M:S -> $hours:$minutes:$seconds")


    //task 4

    var score = 0
    val first = readln().toInt()
    score += first

    val second = readln().toInt()
    score += second

    val third = readln().toInt()
    score += third

    println("Final score : $score")


    //task 5
    print("Enter Celsius: ")
    val c = readln().toDouble()

    val f = c * 9.0 / 5.0 + 32.0

    println("C = $c")
    println("F = $f")

    if (f < 32.0) {
        println("below freezing")
    } else {
        println("not below freezing")
    }


    // task 6

    val base : Long = 8_100_000_000L
    print("Extra : ")
    val extra = readln().toInt()

    val totall = base + extra.toLong()

    println("Bas: $base")
    println("Extra: $extra")
    println("Total: $totall")

    //task 7

    val small: Byte = 100
    val medium: Short = 20_000

    val sum = small + medium

    println("Sum = $sum")
    println("The type of the sum is Int")




}