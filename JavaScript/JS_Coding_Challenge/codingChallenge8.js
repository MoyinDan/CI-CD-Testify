

//Return a Boolean if a number is divisible by 10.

    function divisibleBy10(number) {
        if (number % 10 === 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Test the function
    console.log(divisibleBy10(100)); 
    