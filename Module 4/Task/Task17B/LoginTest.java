package Task17B;


//All testers in your unit must test that the correct username is entered,
// correct password that matches the username and that
// Login to the homePage or dashboard is successful. As the test Lead,
// create an interface that the testers should.

    // Interface for login testing
    public interface LoginTest {
        // Method to test entering correct username
        void testCorrectUsername(String username);

        // Method to test entering correct password that matches the username
        void testCorrectPassword(String username, String password);

        // Method to test successful login to the homePage or dashboard
        void testSuccessfulLogin(String username, String password);
    }






