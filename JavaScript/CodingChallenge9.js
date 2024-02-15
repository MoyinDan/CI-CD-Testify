

//Return the number of vowels in a string
function countVowels(str) {
    // Convert the string to lowercase to handle both uppercase and lowercase vowels
    string = str.toLowerCase();
    
    // Define an array of vowels
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    
    // Initialize a counter to keep track of the number of vowels
    let count = 0;
    
    // Loop through each character in the string
    for (let character of str) {
        // Check if the character is a vowel
        if (vowels.includes(character)) {
            count++; 
        }
    }
    
    // Return the total count of vowels
    return count;
}

console.log(countVowels("Automation"));
