package org.task;

public class Task4 {
    public static void main(String[] args) {

                //Basic Arithmetic + - * /
                double age1 = 30;
                double age2 = 25;
                //System.out.println(age1*age2);

                //incremental and decremental ++, --
                //age1++

                //Compound Assignment Operator += -= /= *=
                age1*= age2;
                //System.out.println(age1);

//        Task 4
//        find the area of a circle with radius on12.7m.
//       Print out your result with the unit of measurement which is metres
////        Area=π×radius^2
//        HOW TO SUBMIT:
//
//        Create a Module 4 directory on your Test Automation Repository on Github
//        Inside this folder, Create a Task and a 1 week challenge Folders
//        Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//        Test_Automation_School Repository >> Module 4 >> Task >> Task 4

                double radius = 12.7; // radius of the circle in meters
                double area;

                // Calculate area using the formula
                area = Math.PI * radius * radius;

                System.out.println(Math.PI * radius * radius);
            }
        }






