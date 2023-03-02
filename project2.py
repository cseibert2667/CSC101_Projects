import random

# 1 = rock, 2 = paper, 3 = scissors
ROCK = 1
PAPER = 2
SCISSORS = 3
# set seed to have predictable "random" results, for testing
# random.seed(69)
# get inputs for player names & num_rounds
player_1 = input("Enter player 1 name: ")
player_2 = input("Enter player 2 name: ")
num_rounds = int(input("Enter number of rounds: "))
# player wins starting at 0
p1wins = 0
p2wins = 0
# make sure num_rounds is positive
while (num_rounds < 0):
    print("Rounds must be > 0")
    num_rounds = int(input("Enter number of rounds: "))
# print p1 vs p2 for x rounds
print(player_1,"vs",player_2,"for",num_rounds,"rounds")
# random player inputs (random.randint(1,3))
p1_input = (random.randint(1,3))
p2_input = (random.randint(1,3))
# loop for number of rounds
for i in range(num_rounds):
    # print tie if inputs match
    while (p1_input == p2_input):
        print("Tie")
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    # identify winner, increment player wins, get new random inputs
    if p1_input == SCISSORS and p2_input == PAPER:
        print(player_1,"wins with scissors")
        p1wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    elif p1_input == ROCK and p2_input == SCISSORS:
        print(player_1,"wins with rock")
        p1wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    elif p1_input == PAPER and p2_input == ROCK:
        print(player_1,"wins with paper")
        p1wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    elif p2_input == SCISSORS and p1_input == PAPER:
        print(player_2,"wins with scissors")
        p2wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    elif p2_input == ROCK and p1_input == SCISSORS:
        print(player_2,"wins with rock")
        p2wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))
    elif p2_input == PAPER and p1_input == ROCK:
        print(player_2,"wins with paper")
        p2wins += 1
        p1_input = (random.randint(1,3))
        p2_input = (random.randint(1,3))

# print final score
print(player_1,"wins",p1wins,"rounds and",player_2,"wins",p2wins,"rounds. GGs")