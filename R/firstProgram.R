# Greetings
cat("Greetings, this is an average calculator in R for three test scores.\n")
cat("Please enter your name and three test scores.\n")
cat("-------------------------------------------\n")

# Declare variables and Input
cat("Name:\n")
name <- readline()

cat(paste("\nHello,", name, ", enter your test scores\n"))
cat("Score 1:\n")
score1 <- as.numeric(readline())
cat("Score 2:\n")
score2 <- as.numeric(readline())
cat("Score 3:\n")
score3 <- as.numeric(readline())
cat("-------------------------------------------\n")

# Process
average <- (score1 + score2 + score3) / 3

# Output
cat(paste(name, ", your average score is:", sprintf("%.2f", average), "\n"))
cat("-------------------------------------------\n")
