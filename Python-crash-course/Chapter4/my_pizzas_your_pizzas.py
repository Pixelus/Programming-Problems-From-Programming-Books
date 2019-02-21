favorite_pizzas = ["Reine", "Margarita", "Calzone"]
for pizza in favorite_pizzas:
    print("I like to eat " + pizza + " pizza's.")

print("\nI really love pizza!\n")

# Make a copy of the list of favorite pizzas
friend_pizzas = favorite_pizzas[:]
print("Favorite friend pizza: ")
print(friend_pizzas)

# Add a new pizza to the original list
favorite_pizzas.append("Aubergine")

# Add a different pizza to the friend pizza list
friend_pizzas.append("4 fromages")

# Display the two separate lists
print("\nMy favorite pizzas are: ")
for pizza in favorite_pizzas:
    print("- " + pizza)
print("\nMy friend's favorite pizzas are: ")
for pizza in friend_pizzas:
    print("- " + pizza)
