//Calculate the sum of numbers within an array
// create an array
const numArray = [8, 9, 13, 15, 20, 22, 40, 45, 50, 55 ]

// create a variable for the sum and initialize it
let sum = 0;

// iterate over each item in the array
for (let i = 0; i < numArray.length; i++ ) {
  sum += numArray[i];
}

console.log(sum) 