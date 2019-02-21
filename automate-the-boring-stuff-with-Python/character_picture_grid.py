#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 12 11:35:46 2018

@author: PixelNew
"""

import copy

grid = [['.', '.', '.', '.','.', '.',],
        ['.', '0', '0', '.','.', '.',],
        ['0', '0', '0', '0','.', '.',],
        ['0', '0', '0', '0','0', '.',],
        ['.', '0', '0', '0','0', '0',],
        ['0', '0', '0', '0','0', '.',],
        ['0', '0', '0', '0','.', '.',],
        ['.', '0', '0', '.','.', '.',],
        ['.', '.', '.', '.','.', '.',]]

# Make a copy from list in deep
draw = copy.deepcopy(grid)

# Slice a list 
for i in range(0, len(draw)):
    print(draw[i][0], end = '')
print("\t")
for i in range(0, len(draw)):
    print(draw[i][1], end = '')
print("\t")
for i in range(0, len(draw)):
    print(draw[i][2], end = '')
print("\t")
for i in range(0, len(draw)):
    print(draw[i][3], end = '')
print("\t")
for i in range(0, len(draw)):
    print(draw[i][4], end = '')
print("\t")
for i in range(0, len(draw)):
    print(draw[i][5], end = '')
print("\t")
