package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if (number % 5 == 0 && number %3 == 0){
            return "fizz buzz";
        }

        if (number % 3 == 0){
            return "fizz";
        }

        if (number % 5 == 0){
            return "buzz";
        }

        return number.toString();
    }

}
