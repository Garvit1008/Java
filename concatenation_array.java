public class concatenation_array {
    public static void main(String[] args) {
        int a[] = {1,2,1};
        int n = (a.length);
        int b[] = new int[2*n];
        for(int i =0;i<a.length;i++){
            b[i]=a[i];
            b[i+n]=a[i];
        }
        for(int i =0 ;i<2*n;i++){
            System.out.print(b[i]);
        }
    }  
}