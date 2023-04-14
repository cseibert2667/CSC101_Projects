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
    print("Player " + (str(i + 1)) + " -- Jersey number: " + (str(jersey_num[i])) + ", Rating: " + (str(rating[i])))
print('\n')

# PRINT MENU
def print_menu():
    print(
        "MENU\n" +
        "u - Update player rating\n" +
        "a - Output players above a rating\n" +
        "r - Replace player\n" +
        "o - Output roster\n" +
        "q - Quit\n" )

# MENU CHOICES
print_menu()
menu_option = input("Choose an option: ")
while menu_option != 'q':

    if menu_option == 'u': # update rating
        to_update = input("Enter a jersey number: ")
        for i in range(len(jersey_num)):
            if to_update == jersey_num[i]:
                rating[i] = input("Enter new rating: ")
        print("Player rating updated successfully.\n")
        print_menu()
        menu_option = input("Choose an option: ")

    elif menu_option == 'a': # output players above given rating
        print("FIXME: OUTPUT >> RATING")
        print_menu()
        menu_option = input("Choose an option: ")

    elif menu_option == 'r': # replace a player
        print("FIXME: REPLACE")
        print_menu()
        menu_option = input("Choose an option: ")

    elif menu_option == 'o': # print the roster
        print("ROSTER")
        for i in range(5):
            print("Player " + (str(i + 1)) + " -- Jersey number: " + (str(jersey_num[i])) + ", Rating: " + (str(rating[i])))
        print('\n')
        print_menu()
        menu_option = input("Choose an option: ")
