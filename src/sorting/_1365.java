package sorting;

public class _1365 {
    //    1365. How Many Numbers Are Smaller Than the Current Number
    // Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++)
            count[nums[i]]++;

        for (int i = 1 ; i <= 100; i++)
            count[i] += count[i-1];

        for (int i = 0; i < nums.length; i++)
            res[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] res = _1365.smallerNumbersThanCurrent(nums); //expected {4,0,1,1,3}
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
