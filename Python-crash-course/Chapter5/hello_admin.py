usernames = ["admin", "Nan", "Sandz", "NanSandz", "Fanny"]
for username in usernames:
    print("Hello " + username, end = '')
    if(username == "admin"):
        print(", would you like to see a status report?")
    else:
        print(", thank you for logging in again.")
