# -*- coding: utf-8 -*-
"""
Created on Tue Nov 29 2018
@author: PixelNew
"""

print("\n")
sandwich_orders = ["Pastrami", "Panini", "Pastrami", "American", "Pita", "Pastrami", "Kebab"]
finished_sandwiches = []
print(sandwich_orders)
print("The deli has run out of pastrami.")

while "Pastrami" in sandwich_orders:
    sandwich_orders.remove("Pastrami")

print("\n")

while sandwich_orders:
    current_sandwhich = sandwich_orders.pop()
    print("I made your " + current_sandwhich + " sandwich.")
    finished_sandwiches.append(current_sandwhich)

print("\n")
print(finished_sandwiches)

print("\n")

for sandwiches in finished_sandwiches:
    print(sandwiches + " have been made.")

print("\n")
