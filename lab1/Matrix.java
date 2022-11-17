public class Matrix implements output {

    private int n;
    private int m;
    int arr[][];

    Matrix(int n, int m, int arr[][]) {
        this.n = n;
        this.m = m;
        this.arr = arr;
    }

    public void multiplyMatrix(int num) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.arr[i][j] = this.arr[i][j] * num;
            }
        }
    }

    public void sumMatrix() {
        int[][] a = {{3, 4, 5}, {7, 1, 3}, {2, 3, 1}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.arr[i][j] = this.arr[i][j] + a[i][j];
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}