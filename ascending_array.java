public class ascending_array {
    public static void main(String[] args) {
        int a[] = {11,32,4,6,9,98,76};
        int t =0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}
