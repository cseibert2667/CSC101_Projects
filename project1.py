import math

# user inputs
wall_height = float(input("Enter height:"))
wall_width = float(input("Enter width:"))
paint_cost = float(input("Enter cost of 1 paint can:"))

# calculations
wall_area = round(wall_height * wall_width, 2)
paint_needed = round(wall_area / 350.0, 3)
cans_needed = math.ceil(paint_needed)
total_cost = (float(cans_needed * paint_cost) * 0.07) + paint_cost * cans_needed

print("- - - - - - - -")
print("Wall area: " + str(wall_area) + " sq ft")
print("Paint needed: " + str(paint_needed) + " gallons")
print("Cans needed: " + str(cans_needed) + " can(s)")
print("Paint cost: $" + str(paint_cost * cans_needed))
print("Sales tax: $" + str(round(float(paint_cost) * 0.07, 2)))
print("Total cost: $" + str(round(total_cost,2)))