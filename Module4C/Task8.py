# Use for loop to iterate from 0 to 10

# For each iteration print out "Number ", i

# If the i value is equal to 2 add the continue

# If the i value is equal to 8 add the break statement



# # For instruction 2, to print out Number and i, use the statement in your loop,
# 	# print("Number", i)


# Use a for loop to iterate from 0 to 10
for i in range(11):  # range(11) generates numbers from 0 to 10 inclusive
    # If the i value is equal to 2, skip the rest of the loop and continue with the next iteration
    if i == 2:
        continue
    # If the i value is equal to 8, exit the loop
    if i == 8:
        break
    # For each iteration, print "Number ", i
    print("Number", i)


