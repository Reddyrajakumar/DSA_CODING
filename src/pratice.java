public class pratice {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int target=8;
        int left=0;
        int right=a.length-1;
        System.out.println(findmatchingvalue(a,left,right,target));
    }
    public static int findmatchingvalue(int[] a,int left,int right,int target){
        int middle=0;
        while(left<right){
            middle=(left+right)/2;
            if(a[middle]==target){
                return middle;
            } else if (a[middle]>target) {
                right=middle;
            } else if (a[middle]<target) {
                left=middle;
            }
        }
        return middle;
    }
}
