public class SortMatrix {
    static int InputMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the " + (i + 1) + "," + (j + 1) + " element");
                matrix[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        return n;
    }

    static int ShowMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    static void SortCrossMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][i] > matrix[j][j]) {
                    int temp = matrix[j][j];
                    matrix[j][j] = matrix[i][i];
                    matrix[i][i] = temp;
                }
            }
        }
    }

    static void SortSecondCrossMatrix(int[][] matrix, int n) {
        for (int i = 0; i<n; i++)
        {
            for (int j = i+1; j<n;j++)
            {
                if(matrix[i][n-i-1] < matrix[j][n-j-1])
                {
                    int temp = matrix[i][n-i-1];
                    matrix[i][n-i-1] = matrix[j][n-j-1];
                    matrix[j][n-j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = new int[4][4];
        int n = InputMatrix(matrix);
        ShowMatrix(matrix, n);
        SortCrossMatrix(matrix, n);
        System.out.println("\nSorted First Cross Matrix: ");
        ShowMatrix(matrix, n);
        SortSecondCrossMatrix(matrix, n);
        System.out.println("\nSorted Second Cross Matrix: ");
        ShowMatrix(matrix, n);
    }
}
