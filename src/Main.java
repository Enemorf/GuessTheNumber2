import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        var min = 0;
        var max = 100;
        System.out.printf("Привет! \nИгра называется \"Угадай число\". " +
                "Загадай число между %d и %d, а я буду его угадывать.\n",min, max );

        int res = max / 2;
        int count = 1;

        while (true)
        {
            if(min == max)
            {
                System.out.printf("Я знаю, что это за число - это %d!\nИ я его угадал с %d попытки!", min,count);
                break;
            }

            System.out.printf("Это число %d? (0 - больше / 1 - меньше / 2 - это оно)\n", res);
            int playerAnswer = in.nextInt();

            switch (playerAnswer) {
                case 0 -> {
                    min = res + 1;
                }
                case 1 -> {
                    max = res - 1;
                }
                case 2 -> {
                    System.out.printf("Ура! Я угадал это число с %d-ой попытки!", count);
                    count = -1;
                }
                default ->
                {
                    System.out.println("Я не понял, что вы ввели, давайте заново.\n");
                    count --;
                }
            }
            res = (max + min) / 2;
            if(count == -1)
                break;
            count ++;
        }

    }


}