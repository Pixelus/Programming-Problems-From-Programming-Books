usernames = [""]

for username in usernames:
    if(username == ""):
        print("We need to find some users!")
    else:
        print("Hello " + username, end='')
        if(username == "admin"):
            print(", would you like to see a status report?")
        else:
            print(", thank you for logging in again.")
