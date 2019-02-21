animals = ["cow", "dog", "cat", "snake", "mouse", "bird"]
for animal in animals:
    print("A " + animal + " would made a great pet.")
print("\nAny of these animals would make a great pet!\n")

# First message
first = animals[:3]
print("The first items in the list are: ")
print(first)

# Second message
middle = animals[2:5]
print("Three items from the middle of the list are: ")
print(middle)

# Third message
last = animals[-3:]
print("The last three items in the liste are: ")
print(last)
