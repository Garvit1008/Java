class search_insert_position {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
int target = 4;
  int l = 0;
    int h = nums.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m]==target){
              System.out.println(m);
            }
            else if(nums[m]>target){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
     System.out.println(l);
    }
}
