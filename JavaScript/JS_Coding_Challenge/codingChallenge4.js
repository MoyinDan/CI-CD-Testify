//Print a table containing multiplication tables.
 
function printMultiplicationTable(rows, columns) {
    // Print column headers
    let table = '  ';
    for (let col = 1; col <= columns; col++) {
        table += col.toString().padStart(4);
    }
    table += '\n';

    // Print table separator
    table += '   ';
    for (let col = 1; col <= columns; col++) {
        table += '----';
    }
    table += '\n';

    // Print table content
    for (let row = 1; row <= rows; row++) {
        table += row.toString().padStart(2) + ' |';
        for (let col = 1; col <= columns; col++) {
            table += (row * col).toString().padStart(4);
        }
        table += '\n';
    }

    console.log(table);
}

printMultiplicationTable(12, 12); 