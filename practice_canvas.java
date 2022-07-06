public class practice_canvas {
    public static void  main(String args[]) {
        int arr[][][] = {{{1,2,3,3,3},{4,5,6,3,3},{2,3,4,3,3}}};
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k=0; k< arr.length; k++ ) {
                    System.out.print(arr[i][j][k] + " ");
                }
                }
            System.out.println();

        }
    }
}
