public class remove_element_from_array {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,4};
        int b =2;
        int n = a.length;
        for(int i =0;i<n;i++){
            if(a[i]==b){
                for(int j =i;j<n-1;j++){
                    a[j] =a[j+1];
                }
                n--;
                i--;
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}