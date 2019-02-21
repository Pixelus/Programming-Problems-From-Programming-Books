#!/usr/bin/env python3
# -*- coding: utf-8 -*-

car = 'subaru'
print("Is car == 'subaru'? I predict True.")
print(car == 'subaru')

print("Is car == 'audi'? I predict Flase.")
print(car == 'audi')

print("Car is == 'Toyota'? I predict False;")
print(car =='Toyota')

print("Is car == 'Subaru'? I predict False.")
print(car == 'Subaru')

print("Is car == 'Subaru'? I predict True.")
print(car.title() == 'Subaru')

print("Is car == 'subaru'? I predict True.")
print(car.lower() == 'subaru')

print("Is car == 'SUBARU'? I predict True.")
print(car.upper() == 'SUBARU')

print("Is car == 'JEEP'? I predict False.")
print(car == 'JEEP')

print("Is car == 'sUbaru'? I predict False.")
print(car == 'sUbaru')

print("Is car == 'SUBARU'? I predict False.")
print(car == 'SUBARU')

print("Is car == 'subaru'? I predict True.")
print(car == 'su' + 'baru')

print("Is car == 'Subaru'? I predict True.")
print(car.title() == 'Su' + 'baru')
