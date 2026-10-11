package Basics;
public class reverseanarray {

    static int[]reverseanarray(int[]nums){
        int start =0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }

    static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int ans[]=reverseanarray(nums);
        for(int an:ans) {
            System.out.println(an);
        }
    }
}
