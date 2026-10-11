public class eightythree {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // Check karo ki Left Half sorted hai ya nahi
            if (nums[s] <= nums[mid]) {
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1; // Left half mein search karo
                } else {
                    s = mid + 1; // Right half mein search karo
                }
            }
            // Agar left sorted nahi hai to Right Half sorted hoga
            else {
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1; // Right half mein search karo
                } else {
                    e = mid - 1; // Left half mein search karo
                }
            }
        }

        return -1; // Target nahi mila
    }
}
