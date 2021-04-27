import java.util.Random;

public class Uzdevums_3 {

    public static void main(String[] args) {
        Random random = new Random();
        int skaitlis = random.nextInt(10) + 1;
        int number = random.nextInt(275) + 1;
        int nomer = random.nextInt(375) + 1;
        int result = (skaitlis+number+nomer);

        System.out.println(skaitlis);
        System.out.println(number);
        System.out.println(nomer);
        System.out.println(result);



    }
}
