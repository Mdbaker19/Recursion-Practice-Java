public class Array1 {
    public static void main(String[] args) {
        System.out.println("Array 1 problems");
    }
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length-1];
    }
}