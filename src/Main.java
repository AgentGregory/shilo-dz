public class Main {
    public static void main(String[] args) {
        int[][] arr_1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //создаю два массива 3 на 3
        int[][] arr_2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] arr_3 = new int[arr_1.length][arr_2[0].length];
        for (int i = 0; i < arr_1.length; i++) { //умножаю массив на массив
            for (int j = 0; j < arr_2[0].length; j++) {
                for (int k = 0; k < arr_2.length; k++) {
                    arr_3[i][j]+= arr_1[i][k]*arr_2[k][j];
                }

            }
            
        }

        for (int i = 0; i < arr_3.length; i++) {//вывожу его
            for (int j = 0; j < arr_3[0].length; j++) {
                System.out.print(arr_3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
