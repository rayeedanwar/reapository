import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String myFirstString = "HelloWorld!";

        System.out.println(myFirstString);

        System.out.println(printString("Howdy"));

        System.out.println(addition(1,2,true));
        System.out.println(addition(1,2,false));
        System.out.println(addition(0,2,false));
        System.out.println(addition(1,0,false));

        for (int i = 0;i < 10;i++)
        {
            System.out.println(addition(i,i,true));
        }

        int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        int[] secondArray= new int[10];

        for (int i = 1; i<11; i++) {

            secondArray[i-1] = i*2;
            System.out.println(i*2 + "added to array");
        }

        secondArray[1] = 1;
        System.out.println(secondArray.toString());




    }

    public static String printString(String input) {

        return input;

    }


    public static int addition(int first, int second, boolean third) {

        if (first == 0) {
            return second;
        } else if(second == 0) {
            return first;
        } else {
            int total;

            if (third == true) {
                total = first * second;
            } else {
                total = first + second;
            }

            return total;
        }
    }

}
