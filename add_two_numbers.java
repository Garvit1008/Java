public class add_two_numbers {
    public static void main(String[] args) {
        int a[] = {2,4,3};
        int b[] = {5,6,4};
        String c = "";
        String d = "";
        for(int i =0;i<a.length;i++){
            c+=a[i];
        }
        for(int i =0;i<b.length;i++){
            d+=b[i];
        }
        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);
        int h[] = new int[a.length];
        int k =0;
int g = e+f;
    for(int i =0;i<a.length;i++){
        while(g!=0){
            int r = g%10;
            h[k]  = r;
            k++;
            g=g/10;
        }
    }
    for(int i =0;i<a.length;i++){
        System.out.print(h[i]+ " ");
    }
    }
}