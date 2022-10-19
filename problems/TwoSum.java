package problems;
public class TwoSum {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 2,7,11,15 };
        TwoSum t = new TwoSum();
        int[] test = t.twoSum(intArray,9);

        for (int i : test) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target){
                    temp[0] = i;
                    temp[1] = j;
                }
            }

        }

        return  temp;
    }
}
