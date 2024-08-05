class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        
        int l=0,r=0;
        
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                map.remove(fruits[l],0);
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        
        return ans;
    }
}