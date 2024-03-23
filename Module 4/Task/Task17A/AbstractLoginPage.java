package Task17A;


//You are required to build the blueprint for your company's login page.
// From the discussions with the product team, all login pages will have a username field,
// password field, forgot password field, and sign-in button while other elements like remember me checkbox,
// continue to homePage, OAuth button will not be applicable to all login pages. with your knowledge of Abstract classes,
// Create a class that others developers will have to inherit from.

// Abstract class representing the blueprint for all login pages
public abstract class AbstractLoginPage {
    // Username field
    public abstract void setUsername(String username);

    // Password field
    public abstract void setPassword(String password);

    // Forgot password field
    public abstract void forgotPassword();

    // Sign-in button
    public abstract void signIn();
}

