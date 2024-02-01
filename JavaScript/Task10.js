
  /* Write JavaScript function, calculateAreaOfRectangle. 
     The function should:
     Takes two parameters, length and width. Multiplies the length 
     and width Returns the area of the rectangle
     */
         
   function calculateAreaOfRectangle(length, width){
        
    const areaOfRectangle = length * width
        
     return areaOfRectangle;

}

const areaOfRectangle = calculateAreaOfRectangle(8, 6)
console.log("The Area of Rectaingle is " + areaOfRectangle);