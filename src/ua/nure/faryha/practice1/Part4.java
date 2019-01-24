package ua.nure.faryha.practice1;

public class Part4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        while (b != 0) {
            int division = a % b;
            a = b;
            b = division;
        }
        System.out.println(a);
    }
}
