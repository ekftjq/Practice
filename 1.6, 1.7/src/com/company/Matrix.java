package com.company;

import java.util.ArrayList;

/**
 * Created by Moon on 4/6/2016.
 */
public class Matrix {
    int[][] matrix;
    ArrayList<Integer> iint = new ArrayList<>();
    ArrayList<Integer> jint = new ArrayList<>();

    //int is 4 bytes

    Matrix(int[][] m) {
        this.matrix = m;
    }

    /*
    0  1  2  3  4
    .  .  .  .  . a
    .  .  .  .  . b
    .  .  .  .  . c
    .  .  .  .  . d
    .  .  .  .  . e
    ij -> mk
    0a -> 4a
    1a -> 4b
    2a -> 4c
    0b -> 3a
    1b -> 3b
    02 -> 03

    */

    public void rotate90() {
        int temp;
        int[][] newmatrix = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                //System.out.println(matrix[i].length);

                newmatrix[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        matrix = newmatrix;
    }

    void printMatrix() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(j == matrix.length-1) {
                    System.out.println(matrix[i][j]);
                }
                else {
                    System.out.print(matrix[i][j] + " , ");
                }
            }
        }
    }

    void setZero() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    iint.add(i);
                    jint.add(j);
                }
            }
        }

        if(iint.size() > 0) {
            for (int i = 0; i < iint.size(); i++) {
                setRowZero(iint.get(i));
            }
        }

        if(jint.size() > 0) {
            for (int j = 0; j < jint.size(); j++) {
                setColumnZero(jint.get(j));
            }
        }
    }

    private void setRowZero(int i) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }

    private void setColumnZero(int j) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][j] = 0;
        }
    }

}
