public class Variables {
    public static void main( String[] args ) {
        //declare variables here before we use them
        int x, y, answer;
        //all three variables will be declared as integers
        double temperature;
        int Temperature;
        //a float uses less memory than a double
        String firstName, lastName, lastMovie;
        String question = "unknown";     //question is initialized</p>
        //assign values to the variables here
        x = 99;
        y = 2147483647; //you could also use the constant Integer.MAX_VALUE
        answer = 40;
        firstName = "Macaya ";
        lastName = "Jones";
        lastMovie = "The Jungle Book";
        // String question = "unknown"; //question is initialized
        temperature = 4.0;
        Temperature = 18;

        //Use the variables here
        System.out.println( "My GPA is a " + temperature );
        System.out.println("The last movie I saw was : " + lastMovie );
        System.out.println("My age is "
                + Temperature);
        System.out.println("My name is " + firstName + lastName );
    }
}

