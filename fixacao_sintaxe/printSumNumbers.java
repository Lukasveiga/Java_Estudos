public class printSumNumbers {

    static public void main(String[] agrs) {

        int result = sumNumbers(1, 1000);
        System.out.println(result);

    }

    public static int sumNumbers(int start, int end){

        if (end > start) {
            return end + sumNumbers(start, end - 1);
        } else {
            return end;
        }
    }
    
}
