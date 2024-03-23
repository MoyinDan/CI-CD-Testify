package Task19D;

public class SubKeyWord {
    public String name = "Delta";

    public void printName(String name){
        //print instance variable name
        System.out.println(this.name);

        //print method variable name
        System.out.println(name);
    }

    public static void main(String[] args) {
        SubKeyWord subKeyWord = new SubKeyWord();
        subKeyWord.printName("Mary");
    }
}

