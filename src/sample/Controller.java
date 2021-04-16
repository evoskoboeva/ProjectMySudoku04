package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller<toString> {
    @FXML TextField txt_00; @FXML TextField txt_01; @FXML TextField txt_02; @FXML TextField txt_03;
    @FXML TextField txt_04; @FXML TextField txt_05; @FXML TextField txt_06; @FXML TextField txt_07;
    @FXML TextField txt_08; @FXML TextField txt_10; @FXML TextField txt_11; @FXML TextField txt_12;
    @FXML TextField txt_13; @FXML TextField txt_14; @FXML TextField txt_15; @FXML TextField txt_16;
    @FXML TextField txt_17; @FXML TextField txt_18; @FXML TextField txt_20; @FXML TextField txt_21;
    @FXML TextField txt_22; @FXML TextField txt_23; @FXML TextField txt_24; @FXML TextField txt_25;
    @FXML TextField txt_26; @FXML TextField txt_27; @FXML TextField txt_28; @FXML TextField txt_30;
    @FXML TextField txt_31; @FXML TextField txt_32; @FXML TextField txt_33; @FXML TextField txt_34;
    @FXML TextField txt_35; @FXML TextField txt_36; @FXML TextField txt_37; @FXML TextField txt_38;
    @FXML TextField txt_40; @FXML TextField txt_41; @FXML TextField txt_42; @FXML TextField txt_43;
    @FXML TextField txt_44; @FXML TextField txt_45; @FXML TextField txt_46; @FXML TextField txt_47;
    @FXML TextField txt_48; @FXML TextField txt_50; @FXML TextField txt_51; @FXML TextField txt_52;
    @FXML TextField txt_53; @FXML TextField txt_54; @FXML TextField txt_55; @FXML TextField txt_56;
    @FXML TextField txt_57; @FXML TextField txt_58; @FXML TextField txt_60; @FXML TextField txt_61;
    @FXML TextField txt_62; @FXML TextField txt_63; @FXML TextField txt_64; @FXML TextField txt_65;
    @FXML TextField txt_66; @FXML TextField txt_67; @FXML TextField txt_68; @FXML TextField txt_70;
    @FXML TextField txt_71; @FXML TextField txt_72; @FXML TextField txt_73; @FXML TextField txt_74;
    @FXML TextField txt_75; @FXML TextField txt_76; @FXML TextField txt_77; @FXML TextField txt_78;
    @FXML TextField txt_80; @FXML TextField txt_81; @FXML TextField txt_82; @FXML TextField txt_83;
    @FXML TextField txt_84; @FXML TextField txt_85; @FXML TextField txt_86; @FXML TextField txt_87;
    @FXML TextField txt_88;
        public int size = 9;
    int[][] matrix = new int[size][size];


    public void Generation(ActionEvent actionEvent) {
        int[][] matrix = new int[size][size];
        int[] temp = new int[size];
        int random;
        int level = 0;
        for (int i = 0; i < 3; i++) {
            int step=0;
            int count =0;
            for (int row = level;  count <3; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = ((col + step+i) % size + 1);
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
        int count = (int)(Math.random()*100+10);
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            int random1 = (int) (Math.random() * 9 + 1);
            int random2 = (int) (Math.random() * 9 + 1);
            for (int col = 0; col < matrix.length; col ++) {
                for (int row = 0; row < matrix.length; row++) {
                    if (matrix[row][col] == random1) {
                        matrix[row][col] = random2;
                    }
                     else if (matrix[row][col] == random2) {
                        matrix[row][col] = random1;
                    }
                }
            }
       }
        count=0;
        do{
            int tempCell;
            int randomRow = (int) (Math.random() * (size));
            int randomCol = (int) (Math.random() * (size));
            if (matrix[randomRow][randomCol]!=0)
            {
                tempCell = matrix[randomRow][randomCol];}
            else continue;
            System.out.println(randomRow);
            System.out.println(randomCol);
            matrix[randomRow][randomCol]= 0;
            count++;
        }
        while (count<50);
        Output(matrix);



    }

    public void Output(int[][] matrix) {


        txt_00.setText((matrix[0][0]!=0? String.valueOf(matrix[0][0]):"")); txt_01.setText((matrix[0][1]!=0? String.valueOf(matrix[0][1]):""));txt_02.setText((matrix[0][2]!=0? String.valueOf(matrix[0][2]):""));
        txt_03.setText((matrix[0][3]!=0? String.valueOf(matrix[0][3]):"")); txt_04.setText((matrix[0][4]!=0? String.valueOf(matrix[0][4]):""));txt_05.setText((matrix[0][5]!=0? String.valueOf(matrix[0][5]):""));
        txt_06.setText((matrix[0][6]!=0? String.valueOf(matrix[0][6]):"")); txt_07.setText((matrix[0][7]!=0? String.valueOf(matrix[0][7]):""));txt_08.setText((matrix[0][8]!=0? String.valueOf(matrix[0][8]):""));
        txt_10.setText((matrix[1][0]!=0? String.valueOf(matrix[1][0]):"")); txt_11.setText((matrix[1][1]!=0? String.valueOf(matrix[1][1]):""));txt_12.setText((matrix[1][2]!=0? String.valueOf(matrix[1][2]):""));
        txt_13.setText((matrix[1][3]!=0? String.valueOf(matrix[1][3]):"")); txt_14.setText((matrix[1][4]!=0? String.valueOf(matrix[1][4]):""));txt_15.setText((matrix[1][5]!=0? String.valueOf(matrix[1][5]):""));
        txt_16.setText((matrix[1][6]!=0? String.valueOf(matrix[1][6]):"")); txt_17.setText((matrix[1][7]!=0? String.valueOf(matrix[1][7]):""));txt_18.setText((matrix[1][8]!=0? String.valueOf(matrix[1][8]):""));
        txt_20.setText((matrix[2][0]!=0? String.valueOf(matrix[2][0]):"")); txt_21.setText((matrix[2][1]!=0? String.valueOf(matrix[2][1]):""));txt_22.setText((matrix[2][2]!=0? String.valueOf(matrix[2][2]):""));
        txt_23.setText((matrix[2][3]!=0? String.valueOf(matrix[2][3]):"")); txt_24.setText((matrix[2][4]!=0? String.valueOf(matrix[2][4]):""));txt_25.setText((matrix[2][5]!=0? String.valueOf(matrix[2][5]):""));
        txt_26.setText((matrix[2][6]!=0? String.valueOf(matrix[2][6]):"")); txt_27.setText((matrix[2][7]!=0? String.valueOf(matrix[2][7]):""));txt_28.setText((matrix[2][8]!=0? String.valueOf(matrix[2][8]):""));
        txt_30.setText((matrix[3][0]!=0? String.valueOf(matrix[3][0]):"")); txt_31.setText((matrix[3][1]!=0? String.valueOf(matrix[3][1]):""));txt_32.setText((matrix[3][2]!=0? String.valueOf(matrix[3][2]):""));
        txt_33.setText((matrix[3][3]!=0? String.valueOf(matrix[3][3]):"")); txt_34.setText((matrix[3][4]!=0? String.valueOf(matrix[3][4]):""));txt_35.setText((matrix[3][5]!=0? String.valueOf(matrix[3][5]):""));
        txt_36.setText((matrix[3][6]!=0? String.valueOf(matrix[3][6]):"")); txt_37.setText((matrix[3][7]!=0? String.valueOf(matrix[3][7]):""));txt_38.setText((matrix[3][8]!=0? String.valueOf(matrix[3][8]):""));
        txt_40.setText((matrix[4][0]!=0? String.valueOf(matrix[4][0]):"")); txt_41.setText((matrix[4][1]!=0? String.valueOf(matrix[4][1]):""));txt_42.setText((matrix[4][2]!=0? String.valueOf(matrix[4][2]):""));
        txt_43.setText((matrix[4][3]!=0? String.valueOf(matrix[4][3]):"")); txt_44.setText((matrix[4][4]!=0? String.valueOf(matrix[4][4]):""));txt_45.setText((matrix[4][5]!=0? String.valueOf(matrix[4][5]):""));
        txt_46.setText((matrix[4][6]!=0? String.valueOf(matrix[4][6]):"")); txt_47.setText((matrix[4][7]!=0? String.valueOf(matrix[4][7]):""));txt_48.setText((matrix[4][8]!=0? String.valueOf(matrix[4][8]):""));
        txt_50.setText((matrix[5][0]!=0? String.valueOf(matrix[5][0]):"")); txt_51.setText((matrix[5][1]!=0? String.valueOf(matrix[5][1]):""));txt_52.setText((matrix[5][2]!=0? String.valueOf(matrix[5][2]):""));
        txt_53.setText((matrix[5][3]!=0? String.valueOf(matrix[5][3]):"")); txt_54.setText((matrix[5][4]!=0? String.valueOf(matrix[5][4]):""));txt_55.setText((matrix[5][5]!=0? String.valueOf(matrix[5][5]):""));
        txt_56.setText((matrix[5][6]!=0? String.valueOf(matrix[5][6]):"")); txt_57.setText((matrix[5][7]!=0? String.valueOf(matrix[5][7]):""));txt_58.setText((matrix[5][8]!=0? String.valueOf(matrix[5][8]):""));
        txt_60.setText((matrix[6][0]!=0? String.valueOf(matrix[6][0]):"")); txt_61.setText((matrix[6][1]!=0? String.valueOf(matrix[6][1]):""));txt_62.setText((matrix[6][2]!=0? String.valueOf(matrix[6][2]):""));
        txt_63.setText((matrix[6][3]!=0? String.valueOf(matrix[6][3]):"")); txt_64.setText((matrix[6][4]!=0? String.valueOf(matrix[6][4]):""));txt_65.setText((matrix[6][5]!=0? String.valueOf(matrix[6][5]):""));
        txt_66.setText((matrix[6][6]!=0? String.valueOf(matrix[6][6]):"")); txt_67.setText((matrix[6][7]!=0? String.valueOf(matrix[6][7]):""));txt_68.setText((matrix[6][8]!=0? String.valueOf(matrix[6][8]):""));
        txt_70.setText((matrix[7][0]!=0? String.valueOf(matrix[7][0]):"")); txt_71.setText((matrix[7][1]!=0? String.valueOf(matrix[7][1]):""));txt_72.setText((matrix[7][2]!=0? String.valueOf(matrix[7][2]):""));
        txt_73.setText((matrix[7][3]!=0? String.valueOf(matrix[7][3]):"")); txt_74.setText((matrix[7][4]!=0? String.valueOf(matrix[7][4]):""));txt_75.setText((matrix[7][5]!=0? String.valueOf(matrix[7][5]):""));
        txt_76.setText((matrix[7][6]!=0? String.valueOf(matrix[7][6]):"")); txt_77.setText((matrix[7][7]!=0? String.valueOf(matrix[7][7]):""));txt_78.setText((matrix[7][8]!=0? String.valueOf(matrix[7][8]):""));
        txt_80.setText((matrix[8][0]!=0? String.valueOf(matrix[8][0]):"")); txt_81.setText((matrix[8][1]!=0? String.valueOf(matrix[8][1]):""));txt_82.setText((matrix[8][2]!=0? String.valueOf(matrix[8][2]):""));
        txt_83.setText((matrix[8][3]!=0? String.valueOf(matrix[8][3]):"")); txt_84.setText((matrix[8][4]!=0? String.valueOf(matrix[8][4]):""));txt_85.setText((matrix[8][5]!=0? String.valueOf(matrix[8][5]):""));
        txt_86.setText((matrix[8][6]!=0? String.valueOf(matrix[8][6]):"")); txt_87.setText((matrix[8][7]!=0? String.valueOf(matrix[8][7]):""));txt_88.setText((matrix[8][8]!=0? String.valueOf(matrix[8][8]):""));

    }

    public void Play(ActionEvent actionEvent) {

    }
}

