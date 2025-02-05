import java.io.BufferedReader
import java.io.InputStreamReader

// Declare variables
def reader = new BufferedReader(new InputStreamReader(System.in))
def name
def score1, score2, score3

// Greetings
println 'Greetings, this is an average calculator in Groovy for three test scores.'
println 'Please enter your name and three test scores.'
println '-------------------------------------------'

//Input
print 'Name: '
name = reader.readLine()

println "\nHello, ${name}, enter your test scores"
print 'Score 1: '
score1 = reader.readLine().toDouble()
print 'Score 2: '
score2 = reader.readLine().toDouble()
print 'Score 3: '
score3 = reader.readLine().toDouble()
println '-------------------------------------------'

// Process
def average = (score1 + score2 + score3) / 3

// Output
println "${name}, your average score is: ${String.format('%.2f', average)}"
println '-------------------------------------------'

