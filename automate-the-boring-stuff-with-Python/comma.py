#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 12 10:59:17 2018

@author: PixelNew
"""

spam = ['apples', 'bananas', 'tofu', 'cats']

def comma(list):
    for item in list[:-1]:
        lien = ", "
        sequence = list[:-1] 
    print("'" + lien.join(sequence) + ", and " + list[-1] + "'")
    
comma(spam)
