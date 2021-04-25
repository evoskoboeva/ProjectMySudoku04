package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;


public class Controller<toString> {
    @FXML
    TextField txt_00;
    @FXML
    TextField txt_01;
    @FXML
    TextField txt_02;
    @FXML
    TextField txt_03;
    @FXML
    TextField txt_04;
    @FXML
    TextField txt_05;
    @FXML
    TextField txt_06;
    @FXML
    TextField txt_07;
    @FXML
    TextField txt_08;
    @FXML
    TextField txt_10;
    @FXML
    TextField txt_11;
    @FXML
    TextField txt_12;
    @FXML
    TextField txt_13;
    @FXML
    TextField txt_14;
    @FXML
    TextField txt_15;
    @FXML
    TextField txt_16;
    @FXML
    TextField txt_17;
    @FXML
    TextField txt_18;
    @FXML
    TextField txt_20;
    @FXML
    TextField txt_21;
    @FXML
    TextField txt_22;
    @FXML
    TextField txt_23;
    @FXML
    TextField txt_24;
    @FXML
    TextField txt_25;
    @FXML
    TextField txt_26;
    @FXML
    TextField txt_27;
    @FXML
    TextField txt_28;
    @FXML
    TextField txt_30;
    @FXML
    TextField txt_31;
    @FXML
    TextField txt_32;
    @FXML
    TextField txt_33;
    @FXML
    TextField txt_34;
    @FXML
    TextField txt_35;
    @FXML
    TextField txt_36;
    @FXML
    TextField txt_37;
    @FXML
    TextField txt_38;
    @FXML
    TextField txt_40;
    @FXML
    TextField txt_41;
    @FXML
    TextField txt_42;
    @FXML
    TextField txt_43;
    @FXML
    TextField txt_44;
    @FXML
    TextField txt_45;
    @FXML
    TextField txt_46;
    @FXML
    TextField txt_47;
    @FXML
    TextField txt_48;
    @FXML
    TextField txt_50;
    @FXML
    TextField txt_51;
    @FXML
    TextField txt_52;
    @FXML
    TextField txt_53;
    @FXML
    TextField txt_54;
    @FXML
    TextField txt_55;
    @FXML
    TextField txt_56;
    @FXML
    TextField txt_57;
    @FXML
    TextField txt_58;
    @FXML
    TextField txt_60;
    @FXML
    TextField txt_61;
    @FXML
    TextField txt_62;
    @FXML
    TextField txt_63;
    @FXML
    TextField txt_64;
    @FXML
    TextField txt_65;
    @FXML
    TextField txt_66;
    @FXML
    TextField txt_67;
    @FXML
    TextField txt_68;
    @FXML
    TextField txt_70;
    @FXML
    TextField txt_71;
    @FXML
    TextField txt_72;
    @FXML
    TextField txt_73;
    @FXML
    TextField txt_74;
    @FXML
    TextField txt_75;
    @FXML
    TextField txt_76;
    @FXML
    TextField txt_77;
    @FXML
    TextField txt_78;
    @FXML
    TextField txt_80;
    @FXML
    TextField txt_81;
    @FXML
    TextField txt_82;
    @FXML
    TextField txt_83;
    @FXML
    TextField txt_84;
    @FXML
    TextField txt_85;
    @FXML
    TextField txt_86;
    @FXML
    TextField txt_87;
    @FXML
    TextField txt_88;
    @FXML
    Line line4;
    @FXML
    Line line3;
    @FXML
    Line line1;
    @FXML
    Line line2;
     @FXML
    Button button_one;
    @FXML
    Button button_two;
    @FXML
    Button button_three;
    @FXML
    Button button_four;
     @FXML
    Button button_five;
     @FXML
    Button button_six;
     @FXML
    Button button_seven;
     @FXML
    Button button_eight;
     @FXML
    Button button_nine;
    @FXML
    Button clear;
    @FXML
    Button next;

    private @FXML
    Canvas canvas;

    private GameBoard gameBoard;
    private int selectedRow;
    private int selectedColumn;

    public static int size = 9;
    public int levelGame;
    public int[][] matrix = new int[size][size];
    public static int[][] matrixSolution = new int[size][size];
    public static int[][] matrixAuto = new int[size][size];
    public static int[][] matrixInitial = new int[size][size];




    public void GenerationHard(ActionEvent actionEvent) {
        levelGame = 45;
        Generation(actionEvent);

    }
    public void GenerationEasy(ActionEvent actionEvent) {
        levelGame = 30;
        Generation(actionEvent);
    }
    public void Generation(ActionEvent actionEvent) {
        int[][] matrix = new int[size][size];
        int[] temp = new int[size];
        int random;
        int level = 0;
        for (int i = 0; i < 3; i++) {
            int step = 0;
            int count = 0;
            for (int row = level; count < 3; row++) {
                for (int col = 0; col < matrix.length; col++) {
                    matrix[row][col] = ((col + step + i) % size + 1);
                }
                step = step + 3;
                level++;
                count++;
            }
        }


        for (int row = 0; row < matrix.length; row += 3) {
            random = (int) (Math.random() * (2) + 1);
            for (int col = 0; col < matrix.length; col++) {
                temp[col] = matrix[row][col];
                matrix[row][col] = matrix[row + random][col];
                matrix[row + random][col] = temp[col];
            }
        }
        for (int col = 0; col < matrix.length; col += 3) {
            random = (int) (Math.random() * (2) + 1);
            for (int row = 0; row < matrix.length; row++) {
                temp[row] = matrix[row][col];
                matrix[row][col] = matrix[row][col + random];
                matrix[row][col + random] = temp[row];
            }
        }
        int count = (int) (Math.random() * 100 + 10);
        // System.out.println(count);

        for (int i = 0; i < count; i++) {
            int random1 = (int) (Math.random() * 9 + 1);
            int random2 = (int) (Math.random() * 9 + 1);
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    if (matrix[row][col] == random1) {
                        matrix[row][col] = random2;
                    } else if (matrix[row][col] == random2) {
                        matrix[row][col] = random1;
                    }
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrixSolution[row][col]=matrix[row][col];
                System.out.print(matrixSolution[row][col]);
            }
            System.out.println();
        }
        int countSolution=0;
        count = 0;
        do {
            int tempCell;
            int randomRow = (int) (Math.random() * (size));
            int randomCol = (int) (Math.random() * (size));
            if (matrix[randomRow][randomCol] != 0) {
                tempCell = matrix[randomRow][randomCol];
            } else continue;

            //Здесь проверка что решение у судоку одно - пока не работает
            matrix[randomRow][randomCol] = 0;
            matrixAuto[randomRow][randomCol]=0;

            Sudoku sudoku = new Sudoku(matrixAuto);
            sudoku.solve();

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {

                    if (matrixSolution[row][randomCol] != matrixAuto[row][col]) {
                        break;
                    }
                }

            }


            count++;
        }
        while (count < levelGame);
        Output(matrix);
        System.out.println("auto");

        //Output(matrixAuto);  //test
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrixAuto[row][col]);

                matrixInitial[row][col]=matrix[row][col];

            }
            System.out.println();

        }


    }

    public void Output(int[][] matrix) {


        txt_00.setText((matrix[0][0] != 0 ? String.valueOf(matrix[0][0]) : ""));
        txt_01.setText((matrix[0][1] != 0 ? String.valueOf(matrix[0][1]) : ""));
        txt_02.setText((matrix[0][2] != 0 ? String.valueOf(matrix[0][2]) : ""));
        txt_03.setText((matrix[0][3] != 0 ? String.valueOf(matrix[0][3]) : ""));
        txt_04.setText((matrix[0][4] != 0 ? String.valueOf(matrix[0][4]) : ""));
        txt_05.setText((matrix[0][5] != 0 ? String.valueOf(matrix[0][5]) : ""));
        txt_06.setText((matrix[0][6] != 0 ? String.valueOf(matrix[0][6]) : ""));
        txt_07.setText((matrix[0][7] != 0 ? String.valueOf(matrix[0][7]) : ""));
        txt_08.setText((matrix[0][8] != 0 ? String.valueOf(matrix[0][8]) : ""));
        txt_10.setText((matrix[1][0] != 0 ? String.valueOf(matrix[1][0]) : ""));
        txt_11.setText((matrix[1][1] != 0 ? String.valueOf(matrix[1][1]) : ""));
        txt_12.setText((matrix[1][2] != 0 ? String.valueOf(matrix[1][2]) : ""));
        txt_13.setText((matrix[1][3] != 0 ? String.valueOf(matrix[1][3]) : ""));
        txt_14.setText((matrix[1][4] != 0 ? String.valueOf(matrix[1][4]) : ""));
        txt_15.setText((matrix[1][5] != 0 ? String.valueOf(matrix[1][5]) : ""));
        txt_16.setText((matrix[1][6] != 0 ? String.valueOf(matrix[1][6]) : ""));
        txt_17.setText((matrix[1][7] != 0 ? String.valueOf(matrix[1][7]) : ""));
        txt_18.setText((matrix[1][8] != 0 ? String.valueOf(matrix[1][8]) : ""));
        txt_20.setText((matrix[2][0] != 0 ? String.valueOf(matrix[2][0]) : ""));
        txt_21.setText((matrix[2][1] != 0 ? String.valueOf(matrix[2][1]) : ""));
        txt_22.setText((matrix[2][2] != 0 ? String.valueOf(matrix[2][2]) : ""));
        txt_23.setText((matrix[2][3] != 0 ? String.valueOf(matrix[2][3]) : ""));
        txt_24.setText((matrix[2][4] != 0 ? String.valueOf(matrix[2][4]) : ""));
        txt_25.setText((matrix[2][5] != 0 ? String.valueOf(matrix[2][5]) : ""));
        txt_26.setText((matrix[2][6] != 0 ? String.valueOf(matrix[2][6]) : ""));
        txt_27.setText((matrix[2][7] != 0 ? String.valueOf(matrix[2][7]) : ""));
        txt_28.setText((matrix[2][8] != 0 ? String.valueOf(matrix[2][8]) : ""));
        txt_30.setText((matrix[3][0] != 0 ? String.valueOf(matrix[3][0]) : ""));
        txt_31.setText((matrix[3][1] != 0 ? String.valueOf(matrix[3][1]) : ""));
        txt_32.setText((matrix[3][2] != 0 ? String.valueOf(matrix[3][2]) : ""));
        txt_33.setText((matrix[3][3] != 0 ? String.valueOf(matrix[3][3]) : ""));
        txt_34.setText((matrix[3][4] != 0 ? String.valueOf(matrix[3][4]) : ""));
        txt_35.setText((matrix[3][5] != 0 ? String.valueOf(matrix[3][5]) : ""));
        txt_36.setText((matrix[3][6] != 0 ? String.valueOf(matrix[3][6]) : ""));
        txt_37.setText((matrix[3][7] != 0 ? String.valueOf(matrix[3][7]) : ""));
        txt_38.setText((matrix[3][8] != 0 ? String.valueOf(matrix[3][8]) : ""));
        txt_40.setText((matrix[4][0] != 0 ? String.valueOf(matrix[4][0]) : ""));
        txt_41.setText((matrix[4][1] != 0 ? String.valueOf(matrix[4][1]) : ""));
        txt_42.setText((matrix[4][2] != 0 ? String.valueOf(matrix[4][2]) : ""));
        txt_43.setText((matrix[4][3] != 0 ? String.valueOf(matrix[4][3]) : ""));
        txt_44.setText((matrix[4][4] != 0 ? String.valueOf(matrix[4][4]) : ""));
        txt_45.setText((matrix[4][5] != 0 ? String.valueOf(matrix[4][5]) : ""));
        txt_46.setText((matrix[4][6] != 0 ? String.valueOf(matrix[4][6]) : ""));
        txt_47.setText((matrix[4][7] != 0 ? String.valueOf(matrix[4][7]) : ""));
        txt_48.setText((matrix[4][8] != 0 ? String.valueOf(matrix[4][8]) : ""));
        txt_50.setText((matrix[5][0] != 0 ? String.valueOf(matrix[5][0]) : ""));
        txt_51.setText((matrix[5][1] != 0 ? String.valueOf(matrix[5][1]) : ""));
        txt_52.setText((matrix[5][2] != 0 ? String.valueOf(matrix[5][2]) : ""));
        txt_53.setText((matrix[5][3] != 0 ? String.valueOf(matrix[5][3]) : ""));
        txt_54.setText((matrix[5][4] != 0 ? String.valueOf(matrix[5][4]) : ""));
        txt_55.setText((matrix[5][5] != 0 ? String.valueOf(matrix[5][5]) : ""));
        txt_56.setText((matrix[5][6] != 0 ? String.valueOf(matrix[5][6]) : ""));
        txt_57.setText((matrix[5][7] != 0 ? String.valueOf(matrix[5][7]) : ""));
        txt_58.setText((matrix[5][8] != 0 ? String.valueOf(matrix[5][8]) : ""));
        txt_60.setText((matrix[6][0] != 0 ? String.valueOf(matrix[6][0]) : ""));
        txt_61.setText((matrix[6][1] != 0 ? String.valueOf(matrix[6][1]) : ""));
        txt_62.setText((matrix[6][2] != 0 ? String.valueOf(matrix[6][2]) : ""));
        txt_63.setText((matrix[6][3] != 0 ? String.valueOf(matrix[6][3]) : ""));
        txt_64.setText((matrix[6][4] != 0 ? String.valueOf(matrix[6][4]) : ""));
        txt_65.setText((matrix[6][5] != 0 ? String.valueOf(matrix[6][5]) : ""));
        txt_66.setText((matrix[6][6] != 0 ? String.valueOf(matrix[6][6]) : ""));
        txt_67.setText((matrix[6][7] != 0 ? String.valueOf(matrix[6][7]) : ""));
        txt_68.setText((matrix[6][8] != 0 ? String.valueOf(matrix[6][8]) : ""));
        txt_70.setText((matrix[7][0] != 0 ? String.valueOf(matrix[7][0]) : ""));
        txt_71.setText((matrix[7][1] != 0 ? String.valueOf(matrix[7][1]) : ""));
        txt_72.setText((matrix[7][2] != 0 ? String.valueOf(matrix[7][2]) : ""));
        txt_73.setText((matrix[7][3] != 0 ? String.valueOf(matrix[7][3]) : ""));
        txt_74.setText((matrix[7][4] != 0 ? String.valueOf(matrix[7][4]) : ""));
        txt_75.setText((matrix[7][5] != 0 ? String.valueOf(matrix[7][5]) : ""));
        txt_76.setText((matrix[7][6] != 0 ? String.valueOf(matrix[7][6]) : ""));
        txt_77.setText((matrix[7][7] != 0 ? String.valueOf(matrix[7][7]) : ""));
        txt_78.setText((matrix[7][8] != 0 ? String.valueOf(matrix[7][8]) : ""));
        txt_80.setText((matrix[8][0] != 0 ? String.valueOf(matrix[8][0]) : ""));
        txt_81.setText((matrix[8][1] != 0 ? String.valueOf(matrix[8][1]) : ""));
        txt_82.setText((matrix[8][2] != 0 ? String.valueOf(matrix[8][2]) : ""));
        txt_83.setText((matrix[8][3] != 0 ? String.valueOf(matrix[8][3]) : ""));
        txt_84.setText((matrix[8][4] != 0 ? String.valueOf(matrix[8][4]) : ""));
        txt_85.setText((matrix[8][5] != 0 ? String.valueOf(matrix[8][5]) : ""));
        txt_86.setText((matrix[8][6] != 0 ? String.valueOf(matrix[8][6]) : ""));
        txt_87.setText((matrix[8][7] != 0 ? String.valueOf(matrix[8][7]) : ""));
        txt_88.setText((matrix[8][8] != 0 ? String.valueOf(matrix[8][8]) : ""));

    }


    public void Play(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sudoku.fxml"));
        loader.setController(this);

        Parent root = loader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/sample/sudoku.css");
        Stage primaryStage = new Stage();
        initGame();

        primaryStage.setTitle("Sudoku ver.03");
        primaryStage.getIcons().add(new Image("sample/ikon.jpg"));

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void initGame(){
        gameBoard = new GameBoard();
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawCanvas(context);

        selectedColumn = 0;
        selectedRow = 0;


    }

    public void drawCanvas(GraphicsContext context){
        context.clearRect(0, 0, 450, 450);

        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {

                int positionY = row * 50 + 2;
                int positionX = col * 50 + 2;

                int width = 46;
                context.setFill(Color.WHITE);

                context.fillRoundRect(positionX, positionY, width, width, 8, 8);
            }
        }

        context.setStroke(Color.RED);
        context.setLineWidth(2);
        context.strokeRoundRect(selectedColumn * 50 + 2, selectedRow * 50 + 2, 46, 46, 10, 10);

        initBoard(context);
        setPlayerNumbers(context);
        setFinished(context);

    }

    private void initBoard(GraphicsContext context){

        int[][] initial = gameBoard.getInitial();

        // for loop is the same as before
        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {

                int positionY = row * 50 + 30;
                int positionX = col * 50 + 20;

                context.setFill(Color.BLACK);
                context.setFont(new Font(20));

                if(initial[row][col]!=0) {
                    context.fillText(initial[row][col] + "", positionX, positionY);
                }
            }
        }
    }

    private void setPlayerNumbers(GraphicsContext context){
        int[][] player = gameBoard.getPlayer();

        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {

                int positionY = row * 50 + 30;
                int positionX = col * 50 + 20;

                context.setFill(Color.GREEN);
                context.setFont(new Font(22));

                if(player[row][col]!=matrixSolution[row][col]) {
                    context.setFill(Color.RED);
                }

                if(player[row][col]!=0) {
                    context.fillText(player[row][col] + "", positionX, positionY);
                }
            }
        }
    }

    private void setFinished(GraphicsContext context) {
        if (gameBoard.checkForSuccess()) {
            context.clearRect(0, 0, 450, 450);
            line4.setEndX(-101);
            line3.setEndX(-101);
            line1.setEndY(-72);
            line2.setEndY(-72);


            //initBoard(context);
            String[][] zero = gameBoard.getZero();

            // for loop is the same as before
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {

                    int positionY = row * 50 + 30;
                    int positionX = col * 50 + 20;

                    context.setFill(Color.WHITE);
                    context.setFont(new Font(18));

                    // if(matrixSolution[row][col]!=0) {
                    context.fillText(zero[row][col], positionX, positionY);
                    // }
                }
            }
            /*context.setFill(Color.WHITE);
            context.setFont(new Font(30));
            context.fillText("WIN!", 200, 250);
            line4.setFill(Color.WHITE);
*/
        }
    }


    @FXML
    private void canvasBoxSelected(){

        canvas.setOnMouseClicked(event -> {

            int mouseX = (int) event.getX();
            int mouseY = (int) event.getY();

            selectedRow = (mouseY / 50); // update player selected row
            selectedColumn = (mouseX / 50); // update player selected column

            //get the canvas graphics context and redraw
            drawCanvas(canvas.getGraphicsContext2D());
        });
    }

    @FXML
    public void buttonOneClicked() {
        gameBoard.modifyPlayer(1, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonTwoClicked() {
        gameBoard.modifyPlayer(2, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonThreeClicked() {
        gameBoard.modifyPlayer(3, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonFourClicked() {
        gameBoard.modifyPlayer(4, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonFiveClicked() {
        gameBoard.modifyPlayer(5, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonSixClicked() {
        gameBoard.modifyPlayer(6, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonSevenClicked() {
        gameBoard.modifyPlayer(7, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonEightClicked() {
        gameBoard.modifyPlayer(8, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonNineClicked() {
        gameBoard.modifyPlayer(9, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }
    @FXML
    public void buttonClearClicked() {
        gameBoard.modifyPlayer(0, selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());
    }

    @FXML
    public void buttonNextClicked(){
        gameBoard.modifyPlayer(matrixSolution[selectedRow][selectedColumn], selectedRow, selectedColumn);
        drawCanvas(canvas.getGraphicsContext2D());


    }
   /* private void buttonOpenSolutionClicked(){
        int[][] player = gameBoard.getPlayer();

        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {
                gameBoard.modifyPlayer(matrixSolution[row][col], row, col);
                drawCanvas(canvas.getGraphicsContext2D());
            }
        }
    }
*/
   public class My_Clock extends Label {
       public long time;
       My_Clock() {
           time = 0;
           bindToTime();
       };
       private void bindToTime() {
           Timeline timeline = new Timeline(
                   new KeyFrame(Duration.seconds(0), ae -> {
                       time++;
                       setText("" + time);
                   }),new KeyFrame(Duration.millis(1000)));
           timeline.setCycleCount(Animation.INDEFINITE);
           timeline.play();
       }}
}



