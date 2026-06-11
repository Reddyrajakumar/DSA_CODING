public class Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] a={3,8,2,1};
        int minvalue=a[0];
        int max=0;
        for(int i=0;i<a.length;i++){
            int price=a[i]-minvalue;
            if(price>max){
                max=price;
            }
            if(a[i]<minvalue){
                minvalue=a[i];
            }
        }
        System.out.println(max);
    }
}
