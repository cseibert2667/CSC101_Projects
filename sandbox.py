# LISTS (arrays) & TUPLES (immutable)

friends = ["Dane", "Jamie", "Semp", "Megan", "Bonnie"]
numbers = [69, 420, 1337, (3), (15), 20, 360, 112, 99] # 3 & 15 are TUPLES
other_numbers = [30, 15, 24]


# print(friends[1:4]) # prints indexs 1 - 3

friends.append("Joey") # added Joey to friends at end of list

friends.insert(2, "Lisa") # inserts Lisa to friends at index 2

friends.remove("Bonnie") # removes Bonnie

# print(friends.index("Lisa")) # prints index of Lisa

friends.sort() # alphabetical // ascending order

# FUNCTIONS, LOOPS, IFS

# says hello to each item in friends list
def say_hello(): 
    for friend in friends:
        print("Hello " + friend)

# determines if each number is even or odd and prints it
def even_or_odd(): 
    for number in numbers:
        if number % 2 == 0:
            print(str(number) + " is even")
        else:
            print(str(number) + " is odd")

# finds average of any numerical list, rounded to any specified number of digits
def find_average(nums, digits):
    sum = 0
    count = 0
    for num in nums:
        sum = sum + num
        count += 1
    print(round(sum / count, digits))

# basic single-operation calculator
def calculator():
    num1 = int(input("Enter number: "))
    sign = input("Enter +, -, *, or /: ")
    num2 = int(input("Enter number: "))
    if sign == "+":
        result = num1 + num2
    elif sign == "-":
        result = num1 - num2
    elif sign == "*":
        result = num1 * num2
    elif sign == "/":
        result = num1 / num2
    print(result)

# nested loop -- indent text by relative number of spaces
def indent_text():
    userNum = int(input("Enter number: "))
    for i in range(userNum + 1):
        for j in range(i):
            print(" ", end="")
        print(i)

indent_text()