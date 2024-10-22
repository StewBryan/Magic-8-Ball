import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {


    public static void main(String[] args) {

//        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("//*******************************//");
            System.out.println("//****Welcome to the Magic-8 Ball****//");
            System.out.println("//*******************************//");
            System.out.println("//***Where nothing is real, because it is an imaginary item***//");
            System.out.println("//***Sold by a manufactuer who just wants money***//");
            System.out.println("******************************************************");
            System.out.println("**Please choose a number from 1 through 20**x");

            //
            String response = scanner.nextLine();
            switch(response) {
                case "1":
                    System.out.println("Yes, it is certain");
                    break;
                case "2":
                    System.out.println("No answer");
                    break;
                case "3":
                    System.out.println("404 Server Not Found");
                    break;
                case "4":
                    System.out.println("It is unclear");
                    break;
                case "5":
                    System.out.println("Five and feelin alive");
                    break;
                case "6":
                    System.out.println("You wasted money");
                    break;
                case "7":
                    System.out.println("Please return me");
                    break;
                case "8":
                    System.out.println("I am beginning to learn");
                    break;
                case "9":
                    System.out.println("Too hazy to see");
                    break;
                case "10":
                    System.out.println("Yes");
                    break;
                case "11":
                    System.out.println("Try again");
                    break;
                case "12":
                    System.out.println("It is unclear");
                    break;
                case "13":
                    System.out.println("Yes, it is certain");
                    break;
                case "14":
                    System.out.println("No answer");
                    break;
                case "15":
                    System.out.println("This is not the answer you are looking for");
                    break;
                case "16":
                    System.out.println("200 Ok");
                    break;
                case "17":
                    System.out.println("So tired");
                    break;
                case "18":
                    System.out.println("Save me");
                    break;
                case "19":
                    System.out.println("Please return me");
                    break;
                case "20":
                    System.out.println("I am alive!!!");
                    break;
                default:
                    System.out.println("Not a valid choice, I will now self destruct");
                    try {
                        Thread.sleep(2000);
                        System.out.println("......kaboom!");
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    System.exit(0);

            }
        }
    }
}