public class parImparReducao {

    public static void main(String[] args) {

        int x = 13;
        parImparReduc(x);

        System.out.println();
    }
    
    private static void parImparReduc(int x) {

        while (x > 2) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }

            System.out.print(x + " -> ");
        }

        System.out.print(x - 1);
    }
}
