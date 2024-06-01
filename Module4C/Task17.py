# Create a class called Human
# Initialize the class


# Create a class called Human
class Human:

    # Initialize the class with a constructor
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method to print out human details
    def print_details(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Create an instance of the Human class
human_instance = Human("Alice", 30)

# Print the details of the human instance
human_instance.print_details()
