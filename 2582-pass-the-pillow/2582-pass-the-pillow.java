class Solution {
    public int passThePillow(int n, int time) {
        int person=1; // initially 1st person holds the pillow
        
        int direction=1; //The pillow moves forward
        
        for(int i=0;i<time;i++){
            person+=direction; // The pillow moves
            
            if(person==n){ //The pillow reaches last person
                direction=-1; //Move backward
            }
            if(person==1){
                direction=1;
            }
        }
        
        
        return person;
    }
}