package sample;

public class GameBoard {

    /* Array that will contain the complete solution to the board */
    public int[][] solution = new int[Controller.size][Controller.size];
    /* Array that will contain ONLY the numbers initially drawn on the board and that the player can't change */
    public int[][] initial = new int[Controller.size][Controller.size];
    /* Array that will contain player's numbers */
    public int[][] player = new int[Controller.size][Controller.size];
    public String[][] zero = new String[Controller.size][Controller.size];

    public GameBoard() {
        for (int row = 0; row < solution.length; row++) {
            for (int col = 0; col < solution.length; col++) {
                solution[row][col]=Controller.matrixSolution[row][col];
                zero[row][col] = "win";

            }

        }
        for (int row = 0; row < initial.length; row++) {
            for (int col = 0; col < initial.length; col++) {
                initial[row][col]=Controller.matrixInitial[row][col];

            }

        }


        // player's array is initialized as a 9x9 full of zeroes
        player = new int[Controller.size][Controller.size];
    }

    // returns the solution array
    public int[][] getSolution() {
              return solution;
    }

    // returns the initial filled-in numbers array
    public int[][] getInitial() {
        return initial;
    }
    public String[][] getZero(){return zero;}

    // returns the player array
    public int[][] getPlayer() {
        return player;
    }

    // modifies a value in the player array
    public void modifyPlayer(int val, int row, int col) {

        if (initial[row][col] == 0) {

            if(val >=0 && val <= Controller.size) // only values from 0 to 9 inclusive are permitted
                player[row][col] = val;
            else
                System.out.println("Value passed to player falls out of range");
        }

    }

    public boolean checkForSuccess() {
        for(int row = 0; row<Controller.size; row++) {
            for(int col = 0; col<Controller.size; col++) {

                if(initial[row][col] == 0) {

                    if(player[row][col] != solution[row][col]) {

                        return false;
                    }
                }
            }
        }

        return true;
    }



}