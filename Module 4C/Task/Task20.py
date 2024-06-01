
# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human
# Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance


#Create a class called Human

class Human:
    def __init__(self):
        #Add an attribute leg_count with the value of 4
        self.leg_count = 4

    #Add a method called get_gender() that returns "Unknown" in the Human class
    def get_gender(self):
        return "Unknown"

#Create another class called Man that extends Human
class Man(Human):
    pass

class Woman(Human):
    pass

#instantiate the classes Man and Woman
man_instance = Man()
woman_instance = Woman()

#print out the values of the get_gender() method in each object instance
print("Man gender:", man_instance.get_gender())
print("Woman gender:", woman_instance.get_gender())