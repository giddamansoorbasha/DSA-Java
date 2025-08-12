public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {

        int count=0;

        for (int j=0,i=0;i<nums.length;i++){
            if (nums[i]==val){
                count++;
                continue;
            }else{
                nums[j++]=nums[i];
            }
        }
        
        return nums.length-count;
    }
}
