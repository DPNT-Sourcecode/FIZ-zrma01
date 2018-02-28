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

        if (number > 10){
            char[] numberArray = numberString.toCharArray();
            char numberChar = numberArray[0];
            boolean isDeluxe = true;

            for (char c : numberArray){
                if (c != numberChar) {
                    isDeluxe=false;
                    break;
                }
            }

            if (number % 2 != 0){
                if (isDeluxe){
                    if(!result.equals(""))
                        result += " fake deluxe";
                    else
                        result +="fake deluxe";
                }
            } else {
                if (isDeluxe) {
                    if (!result.equals(""))
                        result += " deluxe";
                    else
                        result += "deluxe";
                }
            }
        }

        if (result.equals("")){
            return numberString;
        }

        return result;
    }

}
