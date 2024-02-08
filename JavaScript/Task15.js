/*Task  15

-You now have more books in your library. You should manage them all in one place. Any idea how you can achieve that?... Arrays!
-Create a books array. 
-Each element of this array will be a book object. 
-Each book object will have the following properties
title (string)
description (string)
numberOfPages (number)
authour (string)
reading (boolean)
3. Use a for-loop to loop through the books array and log all books where the reading status is true to the 
*/
    const books = [
      {
        title: 'Test Automation Siplified',
        description: 'TAS is a comprehensive guidebook designed to demystify the test automation',
        numberOfPages: 245,
        author: 'M. Mary Daniel', 
        reading: true,
      },
      {
        title: 'No More Two',
        description: 'A perfect book for a Godly marriage ',
        numberOfPages: 1145,
        author: 'Bro Gbile Akanni', 
        reading: true,
      },
      {
        title: 'Gifted Hands',
        description: 'An autobiographical book about the success story of Dr. Ben Carson',
        numberOfPages: 2845,
        author: 'Dr. Ben Carson', 
        reading: false,
      }
 ]
 // Loop through the books array and log books with reading status true
    for (let i = 0; i < books.length; i++) {
    const book = books[i];
    if (book.reading) {
       console.log(book);
    }
}
