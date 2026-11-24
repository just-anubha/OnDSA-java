class Solution {

    private int CanShip(int[]weights,int capacity){

        int day=1;
        int load=0;


        for(int w:weights){

            if((load+w)>capacity){
              
              day=day+1;
              load=w;

            }
            else{

                load=load+w;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
      int ans=1;
      int low=0;
      int high=0;

      for (int w:weights){

        low=Math.max(low,w);
       
       high= high+w;
      }

      while(low<=high){

        int mid=low+(high-low)/2;
         
         if(CanShip(weights,mid)<=days){

            ans=mid;
            high=mid-1;
         }

         else{

            low=mid+1;
         }

      }
      
      return ans;
   
        
    }
}