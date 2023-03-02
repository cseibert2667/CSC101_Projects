import random

# 1 = rock, 2 = paper, 3 = scissors
ROCK = 1
PAPER = 2
SCISSORS = 3
# get inputs for player names & num_rounds
player_1 = input("Enter player 1 name: ")
player_2 = input("Enter player 2 name: ")
num_rounds = int(input("Enter number of rounds: "))
# make sure num_rounds is positive
while (num_rounds < 0):
    print("Rounds must be > 0")
    num_rounds = int(input("Enter number of rounds: "))
# print p1 vs p2 for x rounds
print(player_1,"vs",player_2,"for",num_rounds,"rounds")
# random player inputs (random.randint(1,3))
# loop for number of rounds
    # print tie if inputs match
    # identify winner, increment player wins, get new random inputs
# print final score