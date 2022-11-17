public class Main {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 3}, {0, 1, 2}, {3, 6, 9}};
        Matrix matrix = new Matrix(array.length, array[0].length, array);
        Number number = new Number();

        number.setNumber(9);
        number.print();
        System.out.print("\n");

        matrix.print();
        System.out.print("\n");

        int num = 5;
        matrix.multiplyMatrix(num);
        matrix.print();

        System.out.print("\n");
        matrix.sumMatrix();
        matrix.print();
    }
}