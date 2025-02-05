# Greetings
puts 'Greetings, this is an average calculator for three test scores.'
puts 'Please enter your name and three test scores.'
puts '-------------------------------------------'

# Declare variables and input
print 'Name: '
name = gets.chomp

puts "\nHello, #{name}, enter your test scores"
print 'Score 1: '
score1 = gets.chomp.to_f
print 'Score 2: '
score2 = gets.chomp.to_f
print 'Score 3: '
score3 = gets.chomp.to_f
puts '-------------------------------------------'

# Process
average = (score1 + score2 + score3) / 3

# Output
puts "#{name}, your average score is: %.2f" % average
puts '-------------------------------------------'
