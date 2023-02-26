# LISTS (arrays) & TUPLES (immutable)

friends = ["Dane", "Jamie", "Semp", "Megan", "Bonnie"]
numbers = [69, 420, 1337, (3, 15)] # 3 & 15 are TUPLES


print(friends[1:4]) # prints indexs 1 - 3

friends.append("Joey") # added Joey to friends at end of list

friends.insert(2, "Lisa") # inserts Lisa to friends at index 2

friends.remove("Bonnie") # removes Bonnie

print(friends.index("Lisa")) # prints index of Lisa

friends.sort() # alphabetical // ascending order

print(numbers) 

# FUNCTIONS, LOOPS, IFS

def say_hello():
    for friend in friends:
        print("Hello " + friend)

say_hello()