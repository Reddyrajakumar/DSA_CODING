package Wissen_Client_round1;

public class Snow_balls {
    public static void main(String[] args) {
       int a[]={0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0};
       int n=a.length;
       int leftmax[]=new int[n];
       int righmax[]=new int[n];
       leftmax[0]=a[0];
       for(int i=1;i<n;i++){
           if(a[i]>leftmax[i-1]){
               leftmax[i]=a[i];
           }else{
               leftmax[i]=leftmax[i-1];
           }
       }
        leftmax[n-1]=a[n-1];
        for(int i=n-2;i>0;i--){
            if(a[i]>righmax[i+1]){
                righmax[i]=a[i];
            }else{
                righmax[i]=righmax[i+1];
            }
        }
        int sum=0;
        int minsum=0;
        for(int i=0;i<n;i++){
            if(leftmax[i]<righmax[i]){
                minsum=leftmax[i];
            }else{
                minsum=righmax[i];
            }
            if(minsum>a[i]){
                sum=sum+(minsum-a[i]);
            }
        }
        System.out.println(sum);
    }
}
