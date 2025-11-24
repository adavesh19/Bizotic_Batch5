package DAY3.Arrays;

public class ProductExceptSelf {
    public static int[] PES(int [] Array){
        int n=Array.length;
        int[] result =new int[n];
        result[0]=1;
// PREFIX PRODUCT
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*Array[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix=suffix*Array[i];
        }



    }
    public static void main(String[] args) {
        int [] Array={1,2,3,4};
        

    }
    
}
