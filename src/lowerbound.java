public class lowerbound {
    static int lowerrbound(int[]arr , int target){
        int n =arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=target){
                ans=mid;
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        return ans;
    }
    static int uperbound(int[]arr , int target){
        int n =arr.length;
        int s=0;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
                ans=mid;
            }else{
                s=mid+1;
            }

        }
        return ans;
    }

    static void main() {
        int[]arr={10,20,30,40,50,60,70,80};
        int target=55;
        int ans=uperbound(arr,target);
        System.out.println(ans);


        /*int[]arr={10,20,30,30,30,30,30,40,50};
        int target=30;
        int ans=lowerrbound(arr,target);
        System.out.println(ans);
*/
    }
}
