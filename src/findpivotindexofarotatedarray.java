public class findpivotindexofarotatedarray {
    public int pivotinrotatedarray (int[]nums){
        int n =nums.length;
        int s=0;
        int e=n-1;
        int ans=n;
        // no effective rotation
        while(nums[s]<nums[e]){
            return -1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid-1]){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return ans ;
    }

    static void main() {
        int nums[]={50,60,70,10,20,30,40};
        findpivotindexofarotatedarray obj=new findpivotindexofarotatedarray();
        int ans= obj.pivotinrotatedarray(nums);
        System.out.println(ans);
    }
}
