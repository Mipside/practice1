package ua.nure.faryha.practice1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--run1");
        Part1.main(null);

        System.out.println("--run2");
        Part2.main(new String[]{"2", "3"});

        System.out.println("");

        System.out.println("--run3");
        Part3.main(new String[]{"a b", "c d", "34"});

        System.out.println("");

        System.out.println("--run4");
        Part4.main(new String[]{"25", "15"});

        System.out.println("--run5");
        Part5.main(new String[]{"1234"});

        System.out.println("--run6");
        Part6.main(new String[]{"7"});

        System.out.println("");

        System.out.println("--run7");
        Part7.main(null);
    }
}
