package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    private static String convert(String s, int numRows) {
//        String output = "";
//        int noOfColumns = s.length() / 2;
//        char[][] matrix = new char[noOfRows][noOfColumns];
//        int x = 0, y = 0;
//        int index = 0;
//        matrix[x][y] = s.charAt(index); //matrix[0][0] = 'A'; index = 1;
//        index++;
//        while (index < s.length() - 1) {    //0 < 1
//            for (int i = 1; i <= noOfRows - 1; i++) {
//                if (index < s.length() - 1) {   //0<1
//                    x++;
//                    //index = index + 1;//x =1, y=0
//                    matrix[x][y] = s.charAt(index++);  //matrix[1][0] =
//                }
//
//            }
//            for (int i = 1; i <= noOfRows - 1; i++) {
//                if (index < s.length() - 1) {
//                    x--;
//                    y++;
//                    matrix[x][y] = s.charAt(index++);
//                }
//            }
//        }
//
//        for (int i = 0; i < noOfRows; i++) {
//            for (int j = 0; j < noOfColumns; j++) {
//                System.out.print(matrix[i][j]+" ");
//                output = output + matrix[i][j];
//            }
//        }
//
//        return output;


                if (numRows == 1) return s;

                List<StringBuilder> rows = new ArrayList<>();
                for (int i = 0; i < Math.min(numRows, s.length()); i++)
                    rows.add(new StringBuilder());

                int curRow = 0;
                boolean goingDown = false;

                for (char c : s.toCharArray()) {
                    rows.get(curRow).append(c);
                    if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
                    curRow += goingDown ? 1 : -1;
                }

                StringBuilder ret = new StringBuilder();
                for (StringBuilder row : rows) ret.append(row);
                return ret.toString();
            }
        }



//0 0
//
//        1 0 x++,y
//        2 0
//        3 0
//
//        2 1 x--,y++
//        1 2
//        0 3
//
//        1 3 x++,y
//        2 3
//        3 3
//
//        2 4......x--,y++
//        1 5
//        0 6
//
//        1 6.....x++,y
//        2 6
//        3 6
//
//        2 7
//        1 8
//        0 9
