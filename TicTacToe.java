import java.util.Scanner;

public class TicTacToe {

    static char board[][] = new char[3][3];
    static char player = 'X';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // initially filling board with spaces
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = ' ';
            }
        }

        boolean gameEnd = false;

        showBoard();

        while(!gameEnd){

            System.out.println("Player " + player + " chance");

            System.out.print("Enter row: ");
            int r = sc.nextInt();

            System.out.print("Enter column: ");
            int c = sc.nextInt();

            if(r>=0 && r<3 && c>=0 && c<3){

                if(board[r][c] == ' '){

                    board[r][c] = player;

                    showBoard();

                    if(winCheck()){
                        System.out.println("Player " + player + " wins");
                        gameEnd = true;
                    }
                    else if(fullBoard()){
                        System.out.println("Match draw");
                        gameEnd = true;
                    }
                    else{
                        // change player
                        if(player == 'X'){
                            player = 'O';
                        }
                        else{
                            player = 'X';
                        }
                    }

                } else{
                    System.out.println("Already filled, try again");
                }

            } else{
                System.out.println("Wrong input");
            }
        }

        sc.close();
    }

    // display board
    public static void showBoard(){
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j<2) System.out.print(" | ");
            }
            System.out.println();

            if(i<2) System.out.println("---------");
        }
        System.out.println();
    }

    // check win
    public static boolean winCheck(){

        // rows
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                return true;
            }
        }

        // columns
        for(int i=0;i<3;i++){
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                return true;
            }
        }

        // diagonals
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }

        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }

        return false;
    }

    // check full board
    public static boolean fullBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}