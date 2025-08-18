package LeetCode.Medium;
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] array = nums.clone();
        k = k%nums.length;
        int m = nums.length - k;
        int x=0;
        for (int i=0,j=m;i<nums.length;i++){
            if (j<nums.length){
                nums[i] = nums[j++];
            }else{
                nums[i] = array[x++];
            }
        }
    }
}
