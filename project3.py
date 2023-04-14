jersey_num = [0] * 5
rating = [0] * 5

for i in range(5):
    jersey_num[i] = input("Enter Player " + (str(i + 1)) + "'s jersey number: ")
    rating[i] = input("Enter Player " + (str(i + 1)) + "'s rating: ")

print("ROSTER")
for i in range(5):
    # print("hi" + jersey_num[i])
    print("Player " + (str(i + 1)) + " -- Jersey number: " + (str(jersey_num[i])) + ", Rating: " + (str(rating[i])))

