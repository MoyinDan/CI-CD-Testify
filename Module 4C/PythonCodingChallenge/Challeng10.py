
# Create a function that filters out negative numbers.

def filter_negative_numbers(numbers):
    return [num for num in numbers if num >= 0]

sample_numbers = [10, -5, 3, -1, 0, 7, -8, 15]
filtered_numbers = filter_negative_numbers(sample_numbers)

print("Original list:", sample_numbers)
print("Filtered list (non-negative numbers):", filtered_numbers)
