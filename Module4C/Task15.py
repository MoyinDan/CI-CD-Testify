# Declare a list with any value and number of item/element
# Print the list in console
# Sort the list
# Print the list in console again
#
# Note: you can experiment with the other list functions too in the task.


# Declare a list with any value and number of items/elements
A_list = [34, 12, 24, 9, 5, 42]

# Print the list in the console
print("Original list:", A_list)

# Sort the list
A_list.sort()

# Print the list in the console again
print("Sorted list:", A_list)

# Experiment with other list functions

# Append an item to the list
A_list.append(15)
print("After appending 15:", A_list)

# Insert an item at a specific position
A_list.insert(2, 99)
print("After inserting 99 at index 2:", A_list)

# Remove an item from the list
A_list.remove(34)
print("After removing 34:", A_list)

# Reverse the list
A_list.reverse()
print("Reversed list:", A_list)

# Pop an item from the list (default is the last item)
popped_item = A_list.pop()
print("After popping an item:", A_list)
print("Popped item:", popped_item)

# Get the index of an item
index_of_99 = A_list.index(99)
print("Index of 99:", index_of_99)

# Count occurrences of an item
count_of_24 = A_list.count(24)
print("Count of 24:", count_of_24)

# Clear the list
A_list.clear()
print("After clearing the list:", A_list)
