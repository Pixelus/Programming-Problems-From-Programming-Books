current_users = ["Nan", "Sandz", "Fanny", "Doudou", "NanSandz"]
new_users = ["nan", "Sandrine", "Audrey", "Martin", "Fanny"]

for user in new_users:
    if user in current_users:
        print("Username already exists! You need to enter a new username.")
    elif(user.lower() == user or user.upper() == user):
        print("Username already exists! You need to enter a new username.")
    else:
        print("Username is available. Good choice!")
