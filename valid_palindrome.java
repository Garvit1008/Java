public class valid_palindrome {    
    public static void main(String[] args) {
        String s =" race a car";
    s = s.replaceAll("\\s", ""); 
    s = s.replaceAll("[^a-zA-Z0-9]", ""); 
    s = s.toLowerCase(); 
    System.out.println(s);
    int n = s.length();
   String revers = "";
   for(int i=(n-1);i>=0;i--){
    revers +=s.charAt(i);
   }
   System.out.println(revers);
   int c =0;
   for(int i =0;i<n;i++){
    if(s.charAt(i)==revers.charAt(i)){
        c=1;
    }
    else{
        c=0;
        break;
    }
   }
   if(c==1){
    System.out.println("palindrome");
    System.out.println(c);
   }
   else{
    System.out.println("not palindrome");
   }
        }
    }
