player_inventory = {'rope': 1, 'torch': 6, 'gold coin': 42, 'dagger': 1, 'arrow': 12}

def displayInventory(inventory):
    items_count = 0
    print("Inventory: ")
    for key, value in player_inventory.items():
        if(value > 1):
            if(key[-1:] == "h"):
                key = key + "es"
            elif(key[-1:] == "y"):
                key = key + "ies"
            else:
                key = key + "s"
        print("- " + str(value) + " " + key)
        items_count = items_count + value
    print("Total number of items: " + str(items_count) + "\n")

displayInventory(player_inventory)

dragon_loot = ['gold coin', 'dagger', 'gold coin', 'gold coin', 'ruby']

def addToInventory(inventory, added_loot):
    for item in added_loot:
        if item in inventory:
            inventory[item] = inventory[item] + 1
        else:
            inventory[item] = 1

addToInventory(player_inventory, dragon_loot)
displayInventory(player_inventory)
