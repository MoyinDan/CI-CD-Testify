
#Create a class called User
# Create a private attribute called __password with the value "password" in the User class
# Create a method get_password() that returns self.__password in the User class
# Create another class called ActiveUser that inherits from the User class
# Create a method get_password() that returns "********" in the ActiveUser class
# Instantiate an object of the ActiveUser class
# Print the value of get_password() from the object instance

#Create a class called User
class User:
    #Create a private attribute called __password with the value "password" in the User class
    __password = "password"

    #Create a method get_password() that returns self.__password in the User class
    def get_password(self):
        return self.__password

#Create another class called ActiveUser that inherits from the User class
class ActiveUser:

#Create a method get_password() that returns "********" in the ActiveUser class
    def get_password(self):
        return "********"

#Instantiate an object of the ActiveUser class
active_user_instance = ActiveUser()

#Print the value of get_password() from the object instance
print("Password:",active_user_instance.get_password())
