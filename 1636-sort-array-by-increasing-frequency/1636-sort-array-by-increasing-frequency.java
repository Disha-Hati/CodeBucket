class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>(
            (a, b) -> {
                int freqCompare = Integer.compare(b.getValue(), a.getValue()); // Compare frequencies in descending order
                if (freqCompare == 0) {
                    return Integer.compare(a.getKey(), b.getKey()); // Compare values in ascending order if frequencies are the same
                }
                return freqCompare;
            }
        );
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            maxheap.add(entry);
        }
        
        
        int[] ans = new int[nums.length];
        int i = nums.length-1; // Start filling from the beginning
        
        while (!maxheap.isEmpty()) {
           for(int j=0;j<maxheap.peek().getValue();j++){
               ans[i--]=maxheap.peek().getKey();
           }
            maxheap.poll();
        }
        
        return ans;
    }
}