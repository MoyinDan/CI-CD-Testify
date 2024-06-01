
# Create an abstract class called Vehicle
# Create an abstract method called drive_direction()
# Create another class Car that inherits from Vehicle
# Create another class Plane that inherits from Vehicle
# Try running the program and fix the abstract method issues
#
# Optionally instantiate the Car and Plane method, then invoke the drive_direction() in each of the object instances.
#
# Hint: the drive_direction() method in your Car should print "Drive forward",
# while drive_direction() in your Plane class should print "Drive Upward"

import abc

# Create an abstract class called Vehicle
class Vehicle(metaclass=abc.ABCMeta):

    # Create an abstract method called drive_direction()
    @abc.abstractmethod
    def drive_direction(self, direction):
        pass
# Create another class Car that inherits from Vehicle
# Define the Car class that inherits from Vehicle
class Car(Vehicle):
    # Implement the abstract method
    def drive_direction(self):
        print("Drive forward")

# Create another class Plane that inherits from Vehicle
class Plane(Vehicle):

 # Implement the abstract method
    def drive_direction(self):
        print("Drive upward")

# Optionally instantiate the Car and Plane classes
car_instance = Car()
plane_instance = Plane()

# Invoke the drive_direction() method in each object instance
car_instance.drive_direction()
plane_instance.drive_direction() 