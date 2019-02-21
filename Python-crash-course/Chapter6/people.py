# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018

@author: PixelNew
"""
Sandz = {
    'first_name': "Sandrine",
    'last_name': "Angélibert",
    'age': 44,
    'city': "Figeac",
    }
Nanou = {
    'first_name': "N@n",
    'last_name': "Ou",
    'age': 39,
    'city': "Figeac",
    }
Kinou = {
    'first_name': "Ki",
    'last_name': "Nounette",
    'age': 36,
    'city': "Cénac",
    }
    
people = [Sandz, Nanou, Kinou]

for person in people:
    print(person['first_name'] + " " + person['last_name'] + " is " + 
    str(person['age']) + " and live at " + person['city'] + ".")
    
