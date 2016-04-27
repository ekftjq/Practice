package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] m = new int[4][4];
        int num = 1;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                m[i][j] = num;
                num++;
            }
        }
        m[2][3] = 0;
        Matrix r = new Matrix(m);
        r.printMatrix();
        //r.rotate90();
        //r.printMatrix();
        r.setZero();
        r.printMatrix();
    }
}
