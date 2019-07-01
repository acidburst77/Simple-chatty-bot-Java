package assistant;
import java.util.*;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3, age;
        int countingNumber;
        int rightAnswer, userAnswer;

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");

        System.out.println("Please, remind me your name.");
        String name = sc.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");

        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        age = ((number1 % 3) * 70 + (number2 % 5) * 21 + (number3 % 7) * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        countingNumber = sc.nextInt();

        for(int i = 0; i <= countingNumber; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge");
        System.out.println("Which of the following operators is used to allocate memory to an array?");
        System.out.println("1. create");
        System.out.println("2. array");
        System.out.println("3. new");
        System.out.println("4. alloc");

        rightAnswer = 2;

        do {
            userAnswer = sc.nextInt();
            if(userAnswer == rightAnswer) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
            System.out.println("Please, try again.");
        } while (userAnswer != rightAnswer);
    }
}