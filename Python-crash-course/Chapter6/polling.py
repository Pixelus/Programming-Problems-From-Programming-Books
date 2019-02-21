#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 13 11:00:07 2018

@author: PixelNew
"""
favorite_languages = {
    'jen': 'python',
    'sarah': 'c',
    'edward': 'ruby',
    'phil': 'python',
}

for name in favorite_languages.keys():
    print(name.title())

poll = ['jen', 'john', 'tib', 'marc', 'sarah', 'james']

for name in favorite_languages:
    if(name in poll):
        print(name + ", thanks for your response.")
    else:
        print(name + ", take the poll please. It's great !")
