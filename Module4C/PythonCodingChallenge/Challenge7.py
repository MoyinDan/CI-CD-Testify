# Sort an array of numbers in descending order.

def sort_array_of_numbers(arr):
    arr.sort(reverse=True)
    return arr


numbers = [10, 2, 33, 45, 5, 66, 7, 88]
sorted_array = sort_array_of_numbers(numbers)
print("Sorted array in descending order:", sorted_array)