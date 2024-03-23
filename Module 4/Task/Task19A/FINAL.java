package Task19A;

    public class FINAL {
    // Declare variables
    private final String ballSize;
    private String ballColour;
    private String ballTexture;

    // Constructor
    public FINAL(String ballSize, String ballColour, String ballTexture) {
        this.ballSize = ballSize;
        this.ballColour = ballColour;
        this.ballTexture = ballTexture;
    }

        public FINAL(String ballSize) {
            this.ballSize = ballSize;
        }

        // Getter methods
    public String getBallSize() {
        return ballSize;
    }

    public String getBallColour() {
        return ballColour;
    }

    public String getBallTexture() {
        return ballTexture;
    }

    // Setter methods
    public void setBallColour(String ballColour) {
        this.ballColour = ballColour;
    }

    public void setBallTexture(String ballTexture) {
        this.ballTexture = ballTexture;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an object of class Task19A
        FINAL ball = new FINAL("Large", "Red", "Smooth");

        // Attempt to change the ball size (which should not be possible)
        //ball.setBallSize("Small");
    }
}


