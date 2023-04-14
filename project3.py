jersey_num = [0] * 5
rating = [0] * 5

# GET INPUTS FOR PLAYER INFO
for i in range(5):
    jersey_num[i] = input("Enter Player " + (str(i + 1)) + "'s jersey number: ")
    rating[i] = input("Enter Player " + (str(i + 1)) + "'s rating: ")
print('\n')

# PRINT ROSTER
print("ROSTER")
for i in range(5):
    # print("hi" + jersey_num[i])
    print("Player " + (str(i + 1)) + " -- Jersey number: " + (str(jersey_num[i])) + ", Rating: " + (str(rating[i])))
print('\n')

# PRINT MENU
print(
    "MENU\n" +
    "u - Update player rating\n"
    "a - Output players above a rating\n"
    "r - Replace player\n"
    "o - Output roster\n"
    "q - Quit\n"
    "Choose an option: "
    menuOption = input("Choose an option: ")
)

# MENU CHOICES