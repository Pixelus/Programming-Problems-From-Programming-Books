# Reads a number from a file and writes the Celsius conversion to a different file.

puts "Reading Fahrenheit temperature value from data file..."
num = File.read("temp.dat")
fahrenheit = num.to_i
celsius = (fahrenheit - 32) * 5/9
puts "Saving result to output file 'temp.out'"
cl = File.new("temp.out", "w")
cl.puts celsius
cl.close
