import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("If I drink, I die. If I eat, I am fine. What am I?");

        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();

            switch (answer) {
                case "Fire":
                    System.out.println("Great");
                    break;
                case "I don’t know":
                    System.out.println("Answer: Fire");
                    break;
                default:
                    System.out.println("Think again");
            }
        }
    }
    }


