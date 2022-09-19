import java.util.Random;
import java.util.Scanner;

/**
 * main
 */

 public class Main {

    public static void main(String[] args) {
        
        System.out.println("Welcome!");
        
        System.out.println("Please Enter Your Name...");
        
        Scanner nameScanner = new Scanner(System.in);
        
        String name = nameScanner.next();
        
        System.out.println("Hello " + name + "...");
        
        System.out.println("shall we start the shitty game?");

        System.out.println("Yes or No ?");
        
        Scanner huidaScanner = new Scanner(System.in);
        
        String huida = huidaScanner.next();

        switch (huida) {
            case "yes" -> System.out.println("Let's go nahui 芜湖起飞");
            case "Yes" -> System.out.println("Let's go nahui 芜湖起飞");
            case "YES" -> System.out.println("Let's go nahui 芜湖起飞");
            default -> {
                System.out.println("你就是个jiba !");
                return;
            }
        }

        System.out.println("Game Starts !");

        Random randomNumber = new Random();

        int number = randomNumber.nextInt(20) + 1;

        System.out.println("Guess a number from 1 to 20, you have 5 chances blyat");

        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i<4; i++) {
            int input = inputScanner.nextInt();
            if (input==number) {
                System.out.println("Congratulation Blyat ! 你这个jb赢了");
                return;
            } else if (input>number) {
                System.out.println("戳啦，爬，lower");
            } else {
                System.out.println("戳啦，爬，higher");
            }
        }

        int lastInput = inputScanner.nextInt();

        if (lastInput==number) {
            System.out.println("Congratulation Blyat ! 你这个jb赢了 ！");
            return;
        } else {
            System.out.println("Game Over ! 你就是个jb ！");
            System.out.println("The Number was: " + number);
            return;
        }
    }
}