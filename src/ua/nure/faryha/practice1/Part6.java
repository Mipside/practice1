package ua.nure.faryha.practice1;

public class Part6 {
    public static final int TWO = 2;

    public static void main(String[] args) {
        int i = TWO;
        int count = 0;
        int num = Integer.parseInt(args[0]);
        while (count < num) {
            if (check(i)) {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }
    }

    
    public static boolean check(int a) {
        for (int j = TWO; j < a; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
