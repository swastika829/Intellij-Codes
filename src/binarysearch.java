public class binarysearch {
    static int applytingbinarysearch (int[]arr, int target){
        int n =arr.length;
        int start=0;
        int end=n-1;
        int mid=start+(start+end)/2;
        while(start<=end){
            if(mid==target){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;

            }else{
                end=mid-1;
            }

            mid=start+(start+end)/2;
        }
        return mid;
    }

    static void main(String[] args) {
        int []arr={3,4,5,6,0,7,8,9};
        int target=6;
        int mid=applytingbinarysearch(arr,target);
        System.out.println(mid);



    }

}
