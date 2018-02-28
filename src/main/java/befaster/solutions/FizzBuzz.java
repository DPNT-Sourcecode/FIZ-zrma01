package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        String result = "";
        String numberString = number.toString();

        if (number % 3 == 0 || numberString.contains("3")){
            result += "fizz";
        }

        if (number % 5 == 0 || numberString.contains("5")){
            if(!result.equals(""))
                result += " buzz";
            else
                result += "buzz"; //lame
        }

        if (result.equals("")){
            return numberString;
        }

        return result;
    }

}
