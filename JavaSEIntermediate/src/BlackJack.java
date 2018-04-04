public class BlackJack {

    public int blackJack(int first, int second) {

        int firstCloseness = 21 - first;
        int secondCloseness = 21 - second;

        if (first <= 0 || second <= 0) {
            System.out.println("Invalid entry!");
            return -1;
        } else if (first > 21 && second > 21) {

            System.out.println("both over 21 dummy");

            return 0;
        } else {


            if (firstCloseness < 0) {
                System.out.println(second);
                return second;
            } else if (secondCloseness < 0) {
                System.out.println(first);
                return first;
            } else if (secondCloseness == firstCloseness) {
                System.out.println("They be da same");
                return 0;
            } else if (secondCloseness > firstCloseness) {
                System.out.println(first);
                return first;
            } else {
                System.out.println(second);
                return second;
            }


        }

    }
}

