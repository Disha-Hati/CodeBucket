class Solution {
    public class Pair {
        int[] point;
        int distance;

        Pair(int[] point, int distance) {
            this.point = point;
            this.distance = distance;
        }
    }
    
    
    public int[][] kClosest(int[][] points, int k) {
                int[][] ans = new int[k][2];
        
        // Max-heap priority queue based on the distance
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.distance - a.distance);

        // Iterate through each point
        for (int i = 0; i < points.length; i++) {
            int ptx = points[i][0];
            int pty = points[i][1];
            int dist = ptx * ptx + pty * pty;

            // Add the point to the max heap
            maxHeap.add(new Pair(points[i], dist));

            // If the size of the heap exceeds k, remove the farthest point
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Extract the k closest points from the heap
        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll().point;
        }

        return ans;
    }
}