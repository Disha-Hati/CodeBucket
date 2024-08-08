class Solution {
    public class Pair {
    int first;
    int second;

    Pair(int value, int diff) {
        this.first = value;
        this.second = diff;
    }
}

class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        if (p1.second != p2.second) {
            return p2.second - p1.second; // Sort by larger difference first (max-heap behavior)
        } else {
            return p2.first - p1.first; // If differences are the same, sort by larger value
        }
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i], Math.abs(x - arr[i])));
            
            if (pq.size() > k) {
                pq.poll(); // Remove the element with the largest difference (or larger value)
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll().first);
        }

        Collections.sort(ans); // Sort the final result

        return ans;
        
    }
}

