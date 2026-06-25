class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maj=0;
        int maxfreq=0;
        for(int val:map.keySet()){
            if(maxfreq<map.get(val)){
                maj=val;
                maxfreq=map.get(val);
            }
        }
        return maj;
    }
}