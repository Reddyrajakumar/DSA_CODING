public class stock_market {
    public static void main(String[] args) {
        int a[]={7,1,2,3,6};
        int minimum=a[0];
        int max=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<minimum){
                minimum=a[i];
            }else{
                int product=a[i]-minimum;
                max=Math.max(max,product);
            }
        }
        System.out.println(max);
    }
}
