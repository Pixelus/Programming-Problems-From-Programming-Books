# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018
@author: PixelNew
"""

favorite_numbers = {
    'Sandz': [5, 7],
    'Nan': 6,
    'kinou': [9, 2, 1],
    'Xa': 7,
    'max': 8,
    }

print(favorite_numbers)
favorite_numbers['Mummy'] = 3
print(favorite_numbers)

for name, numbers in favorite_numbers.items():
    print(name.title() + " likes the following numbers: ")
    for number in numbers:
        print(str(number))
