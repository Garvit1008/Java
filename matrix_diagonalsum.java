public class matrix_diagonalsum {
    public static void main(String[] args) {
        int a[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum=0;
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j||i+j==n-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
// 1 1 1 1 
// 1 1 1 1
// 1 1 1 1 
// 1 1 1 1
