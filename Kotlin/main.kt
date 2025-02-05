fun main() {
    // Greetings
    println("Greetings, this is an average calculator in Kotlin for three test scores.")
    println("Please enter your name and three test scores.")
    println("-------------------------------------------")

    // Declare variables
    var name = "";
    var score1: Double = 0.0
    var score2: Double = 0.0
    var score3: Double = 0.0

    //Input
    print("Name: ")
    name = readln()

    println("\nHello, $name, enter your test scores")
    print("Score 1: ")
    score1 = readln().toDouble()
    print("Score 2: ")
    score2 = readln().toDouble()
    print("Score 3: ")
    score3 = readln().toDouble()
    println("-------------------------------------------")

    // Process
    val average = (score1 + score2 + score3) / 3

    // Output
    println("$name, your average score is: %.2f".format(average))
    println("-------------------------------------------")
}
