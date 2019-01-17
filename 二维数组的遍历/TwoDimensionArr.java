package com.company;

public class TwoDimensionArr {

    public static void main(String[] args){
     //数据类型 [][] 数组名 = new 数据类型 [整数][整数]

      /*
      int [][] arr = new int[3][3];
         0   1    2

      0  12   44   6

      1   54   67  88

      2   22   56   11

       */

       int [][] arr = new int[3][3];
       arr[0][0] = 12;
       arr[0][1] = 44;
       arr[0][2] = 6;

        arr[1][0] = 54;
        arr[1][1] = 67;
        arr[1][2] = 88;

        arr[2][0] = 22;
        arr[2][1] = 56;
        arr[2][2] = 11;



        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
                System.out.println();
        }

        System.out.println();

        int array [][] = {{1,2,3},{4,5,6} ,{7,8,9}};

       for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }

                System.out.println();
       }




    }
}
