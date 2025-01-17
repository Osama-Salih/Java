public class App {
 
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] get2DArray(int arr[][]) {
        return new int[][]{
            {4, 2, 7},
            {8, 3, 5}
        };
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        print(arr);
        System.out.println(get2DArray(arr));
    } 
} 
