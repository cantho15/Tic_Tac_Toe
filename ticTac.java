import java.util.Scanner;
public class ticTac{
    static String[] board = new String[9];
    public static String winner = null;
    static void checkBoard(){
        if((board[0].equals("x") && board[1].equals("x") && board[2].equals("x"))||
            (board[0].equals("x") && board[3].equals("x") && board[6].equals("x"))||
            (board[1].equals("x") && board[4].equals("x") && board[7].equals("x"))||
            (board[2].equals("x") && board[5].equals("x") && board[8].equals("x"))||
            (board[0].equals("x") && board[4].equals("x") && board[8].equals("x"))||
            (board[2].equals("x") && board[4].equals("x") && board[6].equals("x"))){
            System.out.println("x wins");
            winner = "X";
        }
        else if ((board[0].equals("y") && board[1].equals("y") && board[2].equals("y"))||
        (board[0].equals("y") && board[3].equals("y") && board[6].equals("y"))||
        (board[1].equals("y") && board[4].equals("y") && board[7].equals("y"))||
        (board[2].equals("y") && board[5].equals("y") && board[8].equals("y"))||
        (board[0].equals("y") && board[4].equals("y") && board[8].equals("y"))||
        (board[2].equals("y") && board[4].equals("y") && board[6].equals("y"))){
            System.out.println("O wins");
            winner = "O";
        }
    }
    static void printBoard(){
        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
    }
    public static void main(String[] args) {
        boolean xturn = true;
        for(int i = 0; i < 9; i++){
            board[i] = String.valueOf(i+1);
        }
        printBoard();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe, x will go first. Enter a spot to place an x in.");
        while(winner == null){
            if(xturn){
                System.out.println("it is X turn");
                int num = scan.nextInt();
                if(board[num-1].equals("x")||board[num-1].equals("o")||num>9||num<1){
                    System.out.println("Invalid selection choose another space");
                } else {
                    board[num-1] = "x";
                    printBoard();
                    checkBoard();
                    xturn = false;
                }
            } else {
                System.out.println("it is O turn");
                int num = scan.nextInt();
                if(board[num-1].equals("x")||board[num-1].equals("o")|| num > 9 || num < 1){
                    System.out.println("Invalid selection choose another space");
                } else {
                    board[num-1] = "o";
                    printBoard();
                    checkBoard();
                    xturn = true;
                }
            }
        }
        System.out.println("game over");
        scan.close();
    }
}