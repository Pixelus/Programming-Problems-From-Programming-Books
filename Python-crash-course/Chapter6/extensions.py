# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018

@author: PixelNew
"""
favorite_places = {'Nan': 6, 'Sandz': 5, 'Kinou': 3}

favorite_places['Max'] = 7
favorite_places['Mummy'] = 8

for name, favorite_place in favorite_places.items():
    print(name + ": " + str(favorite_place))

favorite_places['Xa'] = 4
favorite_places['Lou'] = 9

print("\n")
for name, favorite_place in favorite_places.items():
    print(name + ": " + str(favorite_place))
