import math

wall_height = float(input("Enter height:"))
wall_width = float(input("Enter width:"))
# paint_cost = input("Enter cost of paint:")
wall_area = round(wall_height * wall_width, 2)
paint_needed = round(wall_area / 350.0, 3)
cans_needed = math.ceil(paint_needed)


print("Wall area: " + str(wall_area) + " sq ft")
print("Paint needed: " + str(paint_needed) + " gallons")
print("Cans needed: " + str(cans_needed))
