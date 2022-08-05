package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteraringMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12}  };

        for (int i = arr2D.length - 1; i >= 0; i--) { //i: index number of 1D arrays starting from last index to 0
            //System.out.println(Arrays.toString(arr2D[i]));
            //[8, 9, 10, 11, 12]
            //[4, 5, 6, 7]
            //[1, 2, 3]

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        int[][] arr3D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };

        for (int i = 0; i < arr3D.length; i++) {
            //System.out.println(Arrays.toString(arr3D[i]));
            //[1, 2, 3]
            //[4, 5, 6, 7, 8]
            //[9, 10, 11, 12]

            for (int j = arr3D[i].length - 1; j >= 0; j--) {
                System.out.print(arr3D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        int[][] arr4D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };

        for (int i = arr4D.length - 1; i >= 0; i--) {
           // System.out.println(Arrays.toString(arr4D[i]));
            //[9, 10, 11, 12, 13]
            //[4, 5, 6, 7, 8]
            //[1, 2, 3]

            for (int j = arr4D[i].length - 1; j >= 0; j--) {
                System.out.print(arr4D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */