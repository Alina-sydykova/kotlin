fun main() {

    // Task 1
    val letter: Char = 'K'
    val word: String = "K"

    println("letter = $letter")
    println("word = $word")
    println("word[0] = ${word[0]}")




    // Task 2
    print("Enter a line: ")
    val line = readln()

    if (line.isEmpty()) {
        println("Empty input")
    } else {
        println("first = ${line[0]}")
        println("last = ${line[line.length - 1]}")
    }


    // Task 3
    print("Enter char: ")
    val charLine = readln()
    val ch = charLine[0]

    when (ch) {
        in '0'..'9' -> println("Digit")
        in 'A'..'Z' -> println("Uppercase")
        in 'a'..'z' -> println("Lowercase")
        else -> println("Other")
    }


    // Task 4
    print("Enter digit: ")
    val digitLine = readln()
    val digit = digitLine[0]

    val value = digit - '0'

    println("value = $value")
    println(value * 2)


    // Task 5
    print("Enter text: ")
    val text = readln()

    var letters = 0

    for (character in text) {
        if (character.isLetter()) {
            letters++
        }
    }

    println("Letters: $letters")


    // Task 6
    print("Enter text: ")
    val text2 = readln()

    var result = ""

    for (character in text2) {
        if (character.isLetter()) {
            result += character
        }
    }

    println(result)


    // Task 7
    print("Enter one character: ")
    val helperLine = readln()
    val helperChar = helperLine[0]

    println(helperChar.isDigit())
    println(helperChar.isLetter())
    println(helperChar.isWhitespace())
    println(helperChar.lowercaseChar())
    println(helperChar.uppercaseChar())
}