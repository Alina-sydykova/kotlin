fun main() {

    // Task 1
    print("Enter score: ")
    val score1 = readln().toInt()

    if (score1 >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }


    // Task 2

    print("Enter temperature: ")
    val temperature = readln().toInt()

    if (temperature < 0) {
        println("Freezing")
    } else if (temperature <= 14) {
        println("Cold")
    } else if (temperature <= 24) {
        println("Mild")
    } else {
        println("Warm")
    }


    // Task 3
    print("Enter age: ")
    val age = readln().toInt()

    print("Do you have a ticket? ")
    val hasTicket = readln()

    if (age < 12) {
        println("Too young")
    } else if (hasTicket == "yes") {
        println("Enter")
    } else {
        println("Need a ticket")
    }


    // Task 4
    print("Enter age: ")
    val discountAge = readln().toInt()

    if (discountAge < 13 || discountAge > 65) {
        println("Discount")
    } else {
        println("Regular")
    }


    // Task 5
    print("Enter a: ")
    val a = readln().toInt()

    print("Enter b: ")
    val b = readln().toInt()

    val max = if (a > b) a else b

    println("max = $max")


    // Task 6
    print("Enter score: ")
    val score2 = readln().toInt()

    val grade = when (score2) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    println("Grade: $grade")


    // Task 7 
    print("Enter n: ")
    val n = readln().toInt()

    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n > 0 && n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }

    println(label)
}