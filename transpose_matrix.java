public class transpose_matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        int a[][] = new int[matrix.length][matrix.length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                a[j][i] = matrix[i][j];
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(a[i][j] + " ");
            }
        }
    }
}