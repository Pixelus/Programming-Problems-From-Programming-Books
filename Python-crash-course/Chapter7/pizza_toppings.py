# -*- coding: utf-8 -*-
"""
Created on Tue Nov 29 2018
@author: PixelNew
"""
while True:
    toppings = input("\nEnter your pizza toppings or quit to exit: ")
    if toppings == "quit":
        print("\nYour pizza will be prepared. Please wait 5 minutes.\n")
        break
    else:
        print("\nYou'll add these topping to your pizza: " + toppings + ".")
