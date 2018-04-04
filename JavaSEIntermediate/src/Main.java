public class Main {

    public static void main(String[] args) {

        BlackJack game = new BlackJack();

        game.blackJack(1, 1);
        game.blackJack(11, 1);
        game.blackJack(22, 23);
        game.blackJack(25, -1);
        game.blackJack(25, 1);
        game.blackJack(1, 21);

        UniqueSum testingOut = new UniqueSum(1,3,3);

        System.out.println(testingOut.huhMaths());


    }




}
