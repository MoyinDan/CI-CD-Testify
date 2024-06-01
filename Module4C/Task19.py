#Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with the value of True
# Create a method called get_description, the method should print "This is human"
# Create another method that return the leg count, the name of the method is your choice
#
# Optionally you can instantiate the class and invoke the method get_description() and invoke your method that returns leg count.

# Define the Human class
class Human:
    leg_count = 4
    can_walk = True

    # Method to print a description
    def get_description(self):
        print("This is human")

    # Method to return the leg count
    def get_leg_count(self):
        return self.leg_count

# Optionally instantiate the class
human_instance = Human()

# Invoke the get_description method
human_instance.get_description()

# Invoke the method that returns the leg count and print the result
print("Leg count:", human_instance.get_leg_count())
