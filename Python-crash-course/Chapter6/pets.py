# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018
@author: PixelNew
"""
dog = {'name': 'dog', 'type': 'mammal', 'owner': 'Sandz'}
cat = {'name': 'cat', 'type': 'mammal', 'owner': 'Nan'}
snake = {'name': 'snake', 'type': 'reptile', 'owner': 'Drazik'}
cow = {'name': 'cow', 'type': 'mammal', 'owner': 'Boy'}

pets = [dog, cat, snake, cow]

for pet in pets:
    print(pet['name'].title() + " is a " + pet['type'] + " and owner is " 
    + pet['owner'] + ".")  
