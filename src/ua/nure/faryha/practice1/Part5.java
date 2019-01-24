package ua.nure.faryha.practice1;

public class Part5 {
    public static final int TEN = 10;

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int summa = 0;
        while (a != 0) {
            summa += a % TEN;
            a /= TEN;
        }
        System.out.println(summa);
    }
}
