class Solution {
    public static int subarraySum(int[] nums, int k)
     {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        int currentsum=0;
        for(int i=0;i<nums.length;i++){
            currentsum=currentsum+nums[i];
            if(map.containsKey(currentsum-k)){
                count =count +map.get(currentsum-k);
            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        }
        return count++;
    }
    public static void main(String args[]){
        int [] nums={1,1,1};
        int k =2;
        int result = subarraySum(nums,k);
        System.out.println(result);
    }
   
}