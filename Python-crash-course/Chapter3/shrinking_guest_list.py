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

# Bigger place...
print("Hey, I found a bigger table for dinner... It's so cool!\n")
guests.insert(0, "Fred")
guests.insert(3, "Cathy")
guests.append("Max")

print("Hey " + guests[0] + ", you are waiting for my birthday.")
print("Hey " + guests[1] + ", you are waiting for my birthday.")
print("Hey " + guests[2] + ", you are waiting for my birthday.")
print("Hey " + guests[3] + ", you are waiting for my birthday.")
print("Hey " + guests[4] + ", you are waiting for my birthday.")
print("Hey " + guests[5] + ", you are waiting for my birthday.")
print("Hey " + guests[6] + ", you are waiting for my birthday.\n")
