/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //find the peak element
        //search order agnostically 
        //first ascending part from 0 till peak
        //next in descending from peak till end
        
        int peakIndex=findPeak(mountainArr);
        int first=normalBinarySearch(mountainArr,0,peakIndex,target);
        int second=descBinarySearch(mountainArr,peakIndex,mountainArr.length()-1,target);
        
        if(first!=-1){
            return first;
        }else if(second!=-1){
            return second;
        }  
        return -1;
    }
    
    //find peak index
    public int findPeak(MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    
    public int normalBinarySearch(MountainArray mountainArr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>target){
                end=mid-1;
            }else if(mountainArr.get(mid)<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    public int descBinarySearch(MountainArray mountainArr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>target){
                start=mid+1;
            }else if(mountainArr.get(mid)<target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}