# Declare a dictionary with any key-value pair of items/elements
# Print the dictionary in console
# Update the dictionary with two different key-value pair items
# Print the dictionary in console again
#
# Note: you can experiment with the other list functions too in the task


# Declare a dictionary with any key-value pair items/elements

my_details = {
    "First name": "Mary",
    "Last Name": "Daniel",
    "age": 27,
    "city": "New York"

}
# Print the dictionary in the console
print("Original dictionary:", my_details)

# Update the dictionary with two different key-value pair items
my_details["occupation"] = "Software QA"
my_details["hobby"] = "Reading"

# Print the dictionary in the console again
print("Updated dictionary:", my_details)
Firstname =my_details.get("First name")
print("get:",  Firstname)

# Remove a key-value pair
removed_value = my_details.pop("city")
print("After removing 'city':", my_details)
print("Removed value:", removed_value)

# Check if a key exists in the dictionary
has_age = "age" in my_details
print("Has 'age' key:", has_age)

# Get all key-value pairs in the dictionary
items = my_details.items()
print("Items:", items)

# Get all keys in the dictionary
keys = my_details.keys()
print("Keys:", keys)

# Get all values in the dictionary
values = my_details.values()
print("Values:", values)

#Update-- Add more key value pair to a dictionary

my_details.update({"My Complexion": "Dark"})
print("update:", my_details)
