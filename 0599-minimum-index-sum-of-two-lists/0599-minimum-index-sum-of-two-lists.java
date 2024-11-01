class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      Map<String, Integer> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    int minIndexSum = Integer.MAX_VALUE;

    // Store all strings from list1 with their indices
    for (int i = 0; i < list1.length; i++) {
        map.put(list1[i], i);
    }

    // Traverse list2 and check for common strings
    for (int j = 0; j < list2.length; j++) {
        if (map.containsKey(list2[j])) {
            int i = map.get(list2[j]);
            int indexSum = i + j;

            // If we find a smaller index sum, reset the result list
            if (indexSum < minIndexSum) {
                result.clear();
                result.add(list2[j]);
                minIndexSum = indexSum;
            }
            // If current index sum equals the min index sum, add to result list
            else if (indexSum == minIndexSum) {
                result.add(list2[j]);
            }
        }
    }

    return result.toArray(new String[0]); 
        
        
    }
}