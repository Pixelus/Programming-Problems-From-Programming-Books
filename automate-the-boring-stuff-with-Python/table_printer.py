# -*- coding: utf-8 -*-

tableData = [['apples', 'oranges', 'cherries', 'banana'],
             ['Alice', 'Bob', 'Carol', 'David'],
             ['dogs', 'cats', 'moose', 'goose']]

def printTable(table):
    # Create a new list of 3 "0" values: one for each list in tableData
    # colWidths[0] store the width of the longest string in tableData[0]
    colWidths = [0] * len(table)
    # Search for the longest string in each list of tableData
    # and put the numbers of characters in the new list
    for data in range(len(table)):
        for word in table[data]:
            if colWidths[data] < len(word):
                colWidths[data] = len(word)

    # "rotate" and print the list of lists
    for word in range(len(table[0])) :
        for data in range(len(table)) :
            print(table[data][word].rjust(colWidths[data]), end = ' ')
        print()
        word += 1

printTable(tableData)
