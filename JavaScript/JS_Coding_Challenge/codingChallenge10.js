

//Create a function that filters out negative numbers

function filterNegativeNumbers(arr) {
    
// Use the filter method to create a new array with only positive numbers
    return arr.filter(num => num >= 0);
}

console.log(filterNegativeNumbers([1, -2, 3, -4, 5, 6, -9, 5, -3, 8])); 
