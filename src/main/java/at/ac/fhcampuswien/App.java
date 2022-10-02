package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char myChar = 'Z';
        int hex = 0xface;
        int i = 012;
        long l = 80L;
        float f = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;

        int charToInt = myChar;
        int longToInt = (int)l;
        int floatToInt = (int)f;
        int floatToInt2 = (int)f2;
        int doubleToInt = (int)d1;
        int doubleToInt2 = (int)d2;


        int summe = charToInt + hex + i + longToInt + floatToInt + floatToInt2 + doubleToInt + doubleToInt2;

        System.out.println(summe);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.println("After Swap:");
        // z.B. x= 12 und y = 2
        //x = x+y --> 14
        //y = x-y --> 12
        //x = x-y --> 2

        //System.out.print("x: " + y + "\ny: " + x);
        System.out.println("x: " + y );
        System.out.println("y: " + x );

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2)
        {
            System.out.println("n1 > n2");
        } else if (n1 < n2) {
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();


        if (revenue >= 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue >= 20000 && revenue < 50000 ) {
            System.out.println("Average Sales Revenue");
        } else if (revenue >= 50000 && revenue < 80000 ) {
            System.out.println("Good Sales Revenue");
        } else if (revenue >= 80000 && revenue < 100000 ) {
            System.out.println("Excellent Sales Revenue");
        }
        else
        {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commission = scanner.nextInt();
        switch (commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year%4 == 0 && year%400 == 0)
        {
            System.out.println("Leapyear");
        }
        else
        {
            System.out.println("Not a Leapyear");
            return;
        }
        if (year%100 == 0 && year%400 != 0)
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here

        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //maximal dreistellige ganze Zahl
        String s = String.valueOf(number);
        //s.Length
        if (s.length() > 3) {
            System.out.println("Geben Sie eine gültige max. dreistellige ganze Zahl an!");
        }
        //man könnte für jede Zahl das anders berechnen
        //sprich für eine zweistellige oder einstellige Zahl
        else {
            //z.B 123
            int z1 = number % 10; //letzte Ziffer --> 3
            int z2 = number / 10; //hier wird durch Int, die kommazahl getrennt --> 12
            int z3 = z2 % 10 ; // zweite Ziffer --> 2
            int z4 = z2 /10; // erste Ziffer --> 1
            // 1*100, 2*10, 3*1
            // 3*100 + 2*10 + 1*1
            System.out.println(z1*100+z3*10+z4*1);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}