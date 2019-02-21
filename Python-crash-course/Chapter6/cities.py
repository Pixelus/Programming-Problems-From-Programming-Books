# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018

@author: PixelNew
"""
cities = {'Paris': 
    {'country': 'France', 'population': 600000, 'fact': 'Tour eiffel'},
    'London': 
    {'country': 'England', 'population': 100000, 'fact': 'Tower Bridge'},
    'New York': 
    {'country': 'USA', 'population': 10000000, 'fact': 'MOMA'},
    }

for city, city_info in cities.items():
    print(city)
    print(" - " + city_info['country'])
    print(" - " + str(city_info['population']))
    print(" - " + city_info['fact'])
