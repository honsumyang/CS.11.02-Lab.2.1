/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Honsum Yang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sumOfTwoIntegers = add(3, 8);
        System.out.println(sumOfTwoIntegers);

        int sumOfFourIntegers = add(3, 8, 4, 9);
        System.out.println(sumOfFourIntegers);

        String morningMessage = morningGreeting("Toby Fox");
        System.out.println(morningMessage);

        String afternoonMessage = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMessage);

        String tripledText = triple("oohbaby");
        System.out.println(tripledText);

        double halfOfEvenNumber = half(8);
        System.out.println(halfOfEvenNumber);

        int roundedUpPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedUpPositive);

        int roundedUpNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedUpNegative);
    }

    // 1. add
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    // 2. add
    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return add(add(firstNumber, secondNumber), add(thirdNumber, fourthNumber));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String text) {
        return text + text + text;
    }
    // 6. half
    public static double half(int number) {
        return number / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positiveValue) {
        return (int) (positiveValue + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeValue) {
        return (int) (negativeValue - 0.5);
    }


}

