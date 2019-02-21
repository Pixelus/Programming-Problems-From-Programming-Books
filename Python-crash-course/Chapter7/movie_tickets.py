# -*- coding: utf-8 -*-
"""
Created on Tue Nov 29 2018
@author: PixelNew
"""
age = input("\nHello stranger, enter your age please: ")
ticket_price = 0

if(int(age) >= 3 and int(age) < 12):
    ticket_price = 10
else:
    ticket_price = 15

print("Thank you! Price of your theatre ticket is $" + str(ticket_price) + ". Have a funny show!\n")
