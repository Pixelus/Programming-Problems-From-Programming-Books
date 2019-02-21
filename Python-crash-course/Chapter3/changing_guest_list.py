guests = ["Karine", "Noëlle", "Kinou", "Kareen"]
print("Hey " + guests[3] + ", come on to my home for dinner!")
print(guests[0] + " can you coming home for my birthday today?")
print("Hi " + guests[1] + " would you like a brunch at home sunday?")
print(guests[-1] + " come on please to my party...\n")

# Guest that can't make the dinner
print(guests[3] + " can't make the dinner.")

# Kareen is no longer a guest
no_more_guest = "Kareen"
guests.remove(no_more_guest)
print(no_more_guest + " isn't a guest now!")

# But Steph is in
new_guest = "Steph"
guests.append(new_guest)
print("But " + new_guest + " will come with us.\n")

print("So this is it!")
print(guests[3] + " will come for dinner.")
print(guests[0] + " will come for my birthday.")
print(guests[1] + " will take a brunch.")
print("And " + guests[-1] + " will come to my party.\n")
