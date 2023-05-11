public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int sumRefill = 1100;

        int result = sumRefill >= 1000 ? (startBalance + sumRefill) + sumRefill / 100 : sumRefill + startBalance;

        System.out.println(result);
    }
}