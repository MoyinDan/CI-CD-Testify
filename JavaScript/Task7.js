//Initialize the lengths of the sides of the triangle
const side1 = 3
const side2 = 3
const side3 = 3

// Check if all sides are equal (Equilateral triangle)
if (side1 === side2 && side2 === side3) {
    console.log("Equilateral triangle")
} 
// Check if only two sides are equal (Isosceles triangle)
else if (side1 === side2 || side1 === side3 || side2 === side3) {
    console.log("Isosceles triangle")
} 
// If none of the sides are equal (Scalene triangle)
else {
    console.log("Scalene triangle")
}