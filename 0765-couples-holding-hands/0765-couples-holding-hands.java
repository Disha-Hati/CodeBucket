class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int swaps=0;  //ans
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(row[i],i);
        }
        
        for(int i=0;i<n;i+=2){
            int person1=row[i];
            int expectedPartner=person1^1; //very important step
            
            if(row[i+1]!=expectedPartner){
                // Partner not in the right place, we need a swap
                int partnerPos = map.get(expectedPartner);
                
                // Swap current person at i + 1 with the partner's position
                row[partnerPos] = row[i + 1];
                row[i + 1] = expectedPartner;
                
                 // Update positions in map after swap
                map.put(row[partnerPos], partnerPos);
                map.put(expectedPartner, i + 1);
                
                swaps++;
            }
        }        
        return swaps;
    }
}