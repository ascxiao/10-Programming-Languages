# Greetings
println("Greetings, this is an average calculator in Julia for three test scores.")
println("Please enter your name and three test scores.")
println("-------------------------------------------")

# Declare variables and input
print("Name: ")
name = readline()

println("\nHello, $name, enter your test scores")
print("Score 1: ")
score1 = parse(Float64, readline())
print("Score 2: ")
score2 = parse(Float64, readline())
print("Score 3: ")
score3 = parse(Float64, readline())
println("-------------------------------------------")

# Process
average = (score1 + score2 + score3) / 3

# Output
println("$name, your average score is: $(round(average, digits=2))")
println("-------------------------------------------")
