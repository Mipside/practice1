package ua.nure.faryha.practice1;

public class Part7 {

    //part one - get string and return its index number from excel table
    // is chars2digits(String number) method
    public static final int ENDOFTHEALPHABET = 26;
    public static final int TWO = 2;
    public static final int SIXTYFIVE = 65;

    public static int str2int(String number) {
        int resultctg = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.length() < TWO) {
                resultctg = (number.charAt(i) - 'A' + 1) + (ENDOFTHEALPHABET + resultctg) * i;
                //If it's 'A' ==> 26-26=0   +1 = 1
                //charAt for taking out the one character from string massive
            } else {
                resultctg = (number.charAt(i) - 'A' + 1) + (ENDOFTHEALPHABET * resultctg);
            }
        }
        return resultctg;
    }

    //for jenkins test path
    public static int chars2digits(String number) {
        int num;
        num = str2int(number);
        return num;
    }

    //part two
    //its digits2chars(int number) method
    public static String int2str(int number) {
        String name = "";
        int changingnumber = 0;
        int num = number;
        while (num > 0) {
            changingnumber = (num - 1) % ENDOFTHEALPHABET;
            int x = SIXTYFIVE + changingnumber;
            char ch = (char) x;
            name = Character.toString(ch) + name;
            num = ((num - changingnumber) / ENDOFTHEALPHABET);
        }
        return name;
    }

    //part three
    public static String rightColumn(String number) {
        String namepart3 = "";
        int index;
        index = str2int(number);
        index++;
        namepart3 = int2str(index);
        return namepart3;

    }

    public static void main(String[] args) {
        final String[] c2d = {"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        final int[] d2n = {1, 2, 26, 27, 52, 53, 702, 703};
        for (int i = 0; i < c2d.length; i++) {
            System.out.print(c2d[i] + " ==> ");
            int j = str2int(c2d[i]);
            System.out.print(j);
            String s = int2str(d2n[i]);
            System.out.println(" ==> " + s);
        }
    }
}
