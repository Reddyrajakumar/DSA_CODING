public class max_sum_subset {
    public static void main(String[] args) {
        int a[]={-7,2,4,-1,5,-5,6};
        int currentsum=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            currentsum=Math.max(a[i],currentsum+a[i]);
            max=Math.max(max,currentsum);
        }
        System.out.println(max);
    }
}
