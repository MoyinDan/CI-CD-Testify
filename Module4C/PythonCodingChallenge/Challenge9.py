# Return the number of vowels in a string.

def number_of_vowels(input_string):
    # List of vowels, including uppercase and lowercase
    vowels = "aeiouAEIOU"
    count = 0

    for char in input_string:
        if char in vowels:
            count += 1

    return count


string = "My name is mary Daniel, a student of Test Automation School"
print("Number of vowels in the string:", number_of_vowels(string))