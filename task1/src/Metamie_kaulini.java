import java.util.Random;

public class Metamie_kaulini {

    public static void main(String[] args) {
        Random random = new Random();
        int dice1;
        int dice2;
        int dice3;

        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            dice3 = random.nextInt(6) + 1;

            System.out.println("Dice1 " + dice1);
            System.out.println("Dice2 " + dice2);
            System.out.println("Dice3 " + dice3);

        }while ((dice1 != dice2) || (dice2 != dice3));
    }
}
