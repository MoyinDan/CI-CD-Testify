#Print a table containing multiplication tables.

# Define the size of the multiplication table
size = 10

# Print the multiplication table
for i in range(1, size + 1):
    for j in range(1, size + 1):
        print(f"{i * j:4}", end=" ")
    print()
