fun main() {

    // Task 1
    val nums = listOf(4, 8, 15, 16, 23)

    println("first = ${nums[0]}")
    println("last = ${nums[nums.size - 1]}")
    println("size = ${nums.size}")


    // Task 2
    val items = mutableListOf("milk", "bread")

    print("Enter one more item: ")
    val newItem = readln()

    items.add(newItem)
    items[0] = "oat milk"

    println(items)
    println("Size = ${items.size}")


    // Task 3
    print("Enter n: ")
    val repeatNumber = readln().toInt()

    repeat(repeatNumber) {
        print("*")
    }

    println()


    // Task 4
    print("Enter n: ")
    var countdown = readln().toInt()

    while (countdown > 0) {
        println(countdown)
        countdown--
    }

    println("Go!")


    // Task 5
    val xs = listOf(2, 1, 7, 4)

    var sumA = 0

    for (x in xs) {
        sumA += x
    }

    var sumB = 0

    for (i in 0 until xs.size) {
        sumB += xs[i]
    }

    println("Sum A = $sumA")
    println("Sum B = $sumB")


    // Task 6

    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 0 until 3) {
        print("$i ")
    }
    println()

    for (i in 1..9 step 2) {
        print("$i ")
    }
    println()


    // Task 7
    print("Enter age: ")
    val teenAge = readln().toInt()

    if (teenAge in 13..19) {
        println("Teen")
    } else {
        println("Not a teen")
    }


    // Task 8
    var choice: Int

    do {
        println("1) Hello")
        println("2) Quit")

        print("Choose: ")
        choice = readln().toInt()

        if (choice == 1) {
            println("Hello!")
        } else if (choice != 2) {
            println("Unknown")
        }

    } while (choice != 2)


    // Task 9
    print("Enter numbers: ")
    val line = readln()

    val parts = line.split(" ")

    var sum = 0

    for (part in parts) {
        if (part.isNotEmpty()) {
            sum += part.toInt()
        }
    }

    println("Sum = $sum")
}