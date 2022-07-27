import java.util.concurrent.TimeUnit;

public class forsEncadeados {

    public static void main(String[] args) throws InterruptedException {

        int x = 4;

        for (int i = 1; i <= x; i++) {

            for (int j = i; j <= i*i; j+=i) {

                System.out.print(j + " ");

                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println();

            TimeUnit.SECONDS.sleep(1);
        }
    }
}
