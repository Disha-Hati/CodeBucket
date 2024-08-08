class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();  //<Element,Count>
        
        
        //Put all elements into Map
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
         PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Compare by frequency
        );
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the element with the smallest frequency
            }
        }
        
        // Step 3: Extract the elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }
        
        return result;
        
        
    }
}