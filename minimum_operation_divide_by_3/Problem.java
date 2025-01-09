class Solution {
    public int minimumOperations(int[] nums) {
        int operation =0;

        for (int i=0; i<nums.length; i++){
            int rem = nums[i]%3;

            if(rem==1 ||rem==2){
                operation++;
            }
            
        }
        return operation;
    }
}
// 3190. Find Minimum Operations to Make All Elements Divisible by Three
