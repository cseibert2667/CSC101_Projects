wall_height = float(input("Enter height:"))
wall_width = float(input("Enter width:"))
# paint_cost = input("Enter cost of paint:")
wall_area = round(wall_height * wall_width, 2)
paint_needed = round(wall_area / 350.0, 3)


print("Wall area: " + str(wall_area))
print("Paint needed: " + str(paint_needed) + " gallons.")
