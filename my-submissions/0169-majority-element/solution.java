class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int arr : nums){
            map.put(arr , map.getOrDefault(arr, 0)+1);
            if(map.get(arr) > nums.length /2){
                return arr ;
            }
        }
        return -1 ;
    }
}
        
