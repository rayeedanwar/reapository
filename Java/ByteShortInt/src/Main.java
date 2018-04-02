public class Main {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + (10*(myByte+myShort+myInt));


        System.out.println("My Long value is = " + myLong);

        double myDouble = 50d;
        double mySecondDouble = 80D;
        double remainder = ((myDouble + mySecondDouble)*25%3 );
        System.out.println("My First Double: " + myDouble + "\nMy Second Double: "
                            + mySecondDouble + "\nMy Remainder: " + remainder);

        remainder %= 40;

        System.out.println("Remainder after dividing by 40: " + remainder);

        if (remainder <= 20)
            System.out.println("Remainder is less than or equal to 20. It is: " + remainder);

        double centimeters = calcFeetAndInchesToCentimers(5,4);

        System.out.println("5 Foot 4 inches is " + centimeters + "cm." );
    }
    public static double calcFeetAndInchesToCentimers(double feet, double inches) {
        double feetToInches = feet * 12d;
        inches += feetToInches;
        return inches*2.54;
    }
}
