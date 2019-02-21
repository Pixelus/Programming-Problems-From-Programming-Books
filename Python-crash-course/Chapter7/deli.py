# -*- coding: utf-8 -*-
"""
Created on Tue Nov 29 2018
@author: PixelNew
"""
print("\n")
sandwich_orders = ["Panini", "American", "Pita", "Kebab"]
finished_sandwiches = []

while sandwich_orders:
    current_sandwhich = sandwich_orders.pop()
    print("I made your " + current_sandwhich + " sandwich.")
    finished_sandwiches.append(current_sandwhich)

print("\n")

for sandwiches in finished_sandwiches:
    print(sandwiches + " have been made.")

print("\n")
