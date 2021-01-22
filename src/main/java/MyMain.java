public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        boolean didHit=false;
        if(board[row][col]==true){
            didHit = true;
            System.out.println("There was a hit!");
        }
        else{
            didHit = false;
            System.out.println("You missed a boat!");

        }
        return didHit;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if (direction == "down"){
            for (int r = 0; r < board.length; r++) {
			    board[r][col] = true;
		    }

        }
        if (direction == "right"){
            for (int c = 0; c < board[0].length; c++) {
			    board[row][c] = true;
		    }

        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean alph = false;
        boolean leng = false;
        boolean both = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[i][j].charAt(0) > words[i][j+1].charAt(0)) {
                    alph = false;
                }
                else if (words[i][j].length() > words[i][j+1].length()) {
                    leng = false;
                }
            }
        }
        if(alph == true && leng==true){
            both = true;
        }
        return both;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
