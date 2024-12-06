class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        
        int maxFruits=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            
            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                map.remove(fruits[l],0);
                l++;
            }
            
            maxFruits=Math.max(maxFruits,r-l+1);
            r++;
        }
        
        return maxFruits;
    }
}