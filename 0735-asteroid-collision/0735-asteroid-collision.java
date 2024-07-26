class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                s.push(asteroids[i]);
            }else{// i is negative
                while(!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])){
                    s.pop();
                }
                if(s.isEmpty() || s.peek() < 0){
                    s.push(asteroids[i]);
                }else if(asteroids[i] + s.peek() == 0){
                    s.pop(); //equal
                }
            }
        }
        int[] res = new int[s.size()];   
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = s.pop();
        }
        return res;
    }
}