/*                     Task 14
-Add a toggleReadingStatus method to your books objects. 
-The method should update the value of the reading property of the book object.
-Remember to log the reading property to the console to confirm the current status.
*/

const books = {
    title: 'Test Automation Siplified',
    description: 'TAS is a comprehensive guidebook designed to demystify the test automation',
    numberOfPages: 245,
    author: 'M. Mary Daniel', 
    reading: true,
    toggleReadingStatus() {
        if (books.reading) {
            console.log('Initial reading status is: ' + books.reading);
            books.reading = false;
            console.log('Current reading status is: ' + books.reading);
        } else {
            console.log('Initial reading status is: ' + books.reading);
            books.reading = true;
            console.log('Current reading status is: ' + books.reading);
        }
    }
};
// Test the toggleReadingStatus method
books.toggleReadingStatus();
