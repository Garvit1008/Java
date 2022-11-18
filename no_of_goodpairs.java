class no_of_goodpairs{
    public static void main(String[] args) {
        int a [] = {11,23,123,343,4312,5,10};
        int b=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&&i<j){
                    b++;
                }
            }
        }
        System.out.println(b);
    }
} 