#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018

@author: PixelNew
"""

glossary = {
    'dictionary': "model an actual dictionary",
    'loop': "looping through an array, again and again...",
    'glossary': "name of this dictionary",
    'Python': "very great language I'm learning",
    'Key-value': "pair of two associations",
    }

for i in glossary:
    print(i + ": " + glossary[i] + "\n")

print("\n")
glossary['while'] = "another loop in Python"
glossary['condition'] = "if else elif"
glossary['glossary'] = "name fo this array"
glossary['glossaty'] = "not name of this array"
glossary['error'] = "bug in a program"

for i in glossary:
    print(i + ": " + glossary[i] + "\n")
