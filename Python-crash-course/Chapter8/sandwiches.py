toppings = []

def toppings_sandwich(*toppings):
    print("Toppings in your sandwich :")
    for topping in toppings:
        print("- " + topping)
    print("\n")

toppings_sandwich("egg", "mozzarella", "tomato", "ham")
toppings_sandwich("egg", "peperroni", "tomato", "ham")
toppings_sandwich("mushrooms", "mozzarella", "tomato",)
