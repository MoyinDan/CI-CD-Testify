# Declare a global variable with name as language and the value as "Python"
# Create a function, in the function declare a variable with name as language and value as "Java", then print out the variable in the function
# Print out the variable name into the console
# Invoke the function

# declare global variable
language = "Python"


# Create a function that declares a local variable with the same name
def print_language():
    language = "Java"
    # print variable in the function
    print("Local Variable Language:", language)


# print variable name in the console
print("Global Variable Language:", language)


# invoke the function
print(print_language())