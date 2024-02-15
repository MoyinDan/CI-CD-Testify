

//Create a length converter function.

function lengthConverter(length, fromUnit, toUnit) {
    // Define conversion factors for different units
    const conversionFactors = {
        "cm": 1,
        "m": 100,
        "km": 100000,
        "in": 2.54,
        "ft": 30.48,
        "yd": 91.44,
        "mi": 160934
    };

    // Check if the units are valid
    if (!(fromUnit in conversionFactors) || !(toUnit in conversionFactors)) {
        return "Invalid units";
    }

    // Convert length to base unit (cm)
    const lengthInCm = length * conversionFactors[fromUnit];

    // Convert length from base unit to target unit
    const convertedLength = lengthInCm / conversionFactors[toUnit];

    return convertedLength;
}

console.log(lengthConverter(100, "km", "m")); 
console.log(lengthConverter(1, "m", "cm")); 
console.log(lengthConverter(1, "ft", "m")); 

   