#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Jan 30 11:50:44 2019

@author: PixelNew

pw.py - An insecure password locker progam.

"""

PASSWORDS = {'email': 'F7minlBDDuvMJuxESSKHFhTxFtjVB6',\
             'blog': 'VmALvQyKAxiVH5G8v01if1MLZF3sdt',\
             'luggage': '12345'}

import sys, pyperclip
if len(sys.argv) < 2:
    print("Usage: python pw.py [account] - copy account password")
    sys.exit()

account = sys.argv[1]       # first command line arg is the account name

if account in PASSWORDS:
        pyperclip.copy(PASSWORDS[account])
        print("Password for " + account + " copied to clipboard.")
else:
    print("There is no account named " + account)
