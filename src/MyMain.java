import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int counter=0;

        while(true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;
            while(true){
            System.out.println("Please enter your move : {r = rock}, {p = paper}, {s= scissors}");
             playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
                System.out.println(playerMove + ": is not a valid move");
            }




            if (computerMove.equals(playerMove)) {
                System.out.println("Equality ! play again");
            }
            //------------------------------
            else if (computerMove.equals("p")) {
                if (playerMove.equals("r")) {
                    System.out.println("You lost \uD83D\uDE14 ");
                    System.out.println("Computer played : " + computerMove);
                    break;
                } else {
                    System.out.println("You won \uD83C\uDF89");
                    counter++;
                }
            }//------------------------------------
            else if (computerMove.equals("r")) {
                if (playerMove.equals("p")) {
                    System.out.println("You won \uD83C\uDF89");
                    counter++;
                } else {
                    System.out.println("You lost \uD83D\uDE14");
                    System.out.println("Computer played : " + computerMove);
                    break;

                }
            }//----------------------------------
            else if (computerMove.equals("s")) {
                if (playerMove.equals("p")) {
                    System.out.println("You lost  \uD83D\uDE14 ");
                    System.out.println("Computer played : " + computerMove);
                    break;

                } else {
                    System.out.println("You won \uD83C\uDF89");
                    counter++;
                }
            }

            System.out.println("Computer played : " + computerMove);
        }
        System.out.println("Game Over your Score is : "+ counter*100);
    }
}
